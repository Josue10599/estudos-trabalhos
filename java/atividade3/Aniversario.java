import java.util.Calendar;
import java.util.Date;

public class Aniversario {

    private int dia;
    private int mes;
    private int ano;

    public Aniversario(int dia, int mes, int ano){
        if (dia < 32) {
            this.dia = dia;
        } else{
            System.out.println("Dia inválido!");
        }
        if (mes < 13){
            this.mes = mes;
        } else{
            System.out.println("Mês inválido!");
        }
        if (ano >= 1900){
            this.ano = ano;
        } else {
            System.out.println("Ano inválido!");
        }
    }

    private boolean dataCorreta(){
        return dia != 0 && mes != 0 && ano != 0;
    }
    
    private int numeroDoDiaAtual(){
        return Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
    }

    private int diaAtual(){
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }

    private int mesAtual(){
        return Calendar.getInstance().get(Calendar.MONTH) + 1;
    }

    private int anoAtual(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    private int horaAtual(){
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    private int numeroDoDia(){
        int numeroDoDia = 0;
        for (int contDia = 1, contMes = 1; contMes < mes; contDia++, numeroDoDia++){
            if (contMes < 8){
                if (contMes % 2 == 0){
                    if (contDia == 30){
                        contDia = 0;
                        contMes++;
                    }
                } else if (contDia == 31){
                    contDia = 0;
                    contMes++;
                }
            } else {
                if (contMes % 2 == 0){
                    if (contDia == 31){
                        contDia = 0;
                        contMes++;
                    }
                } else if (contDia == 30){
                    contDia = 0;
                    contMes++;
                }
            }
        }
        return numeroDoDia + dia;
    }

    public int diasVividos(){
        int dias = 0;
        for (int i = ano; i < anoAtual(); i++){
            if (bissexto(i)) 
                dias += 366;
            else 
                dias += 365;
        }
        return dias - numeroDoDia() + numeroDoDiaAtual();
    }

    public int mesesVividos(){
        if (mesAtual() > mes){
            return ((anoAtual() - ano) * 12) + (mesAtual() - mes);
        } else {
            return ((anoAtual() - ano) * 12) - (mes - mesAtual());
        }
    }

    public int anosVividos(){
        if (mes <= mesAtual() && diaAtual() >= dia)
            return anoAtual() - ano;
        else 
            return anoAtual() - ano - 1;
    }

    public int horasVividas(){
        return (diasVividos() * 24) + horaAtual();
    }

    private boolean bissexto(int ano){
        return (ano % 4 == 0 || ano % 400 == 0) && ano % 100 != 0;
    }

    @Override
    public String toString(){
        if (dataCorreta()){
            String texto = "Data: " + dia + "/" + mes + "/" + ano + "\n" +
                        "Data atual: " + diaAtual() + "/" + mesAtual() + "/" + anoAtual() + "\n" +
                        "Dias que se passaram: " + diasVividos() + "\n" +
                        "Meses que se passaram: " + mesesVividos() + "\n" +
                        "Anos que se passaram: " + anosVividos() + "\n" +
                        "Horas que se passaram: " + horasVividas();
            return texto;
        } else {
            return "A data passada é inválida, coloque <dia> <mês> <ano> 'xx xx xxxx'";
        }
    }
}