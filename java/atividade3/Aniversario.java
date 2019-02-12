/**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * Aniversário
 */
import java.util.Calendar;
import java.util.Date;

public class Aniversario {

    private int dia;
    private int mes;
    private int ano;

    /**
     * Recebe o uma data e checa se a mesma é valida, 
     * para atribuir os valores nos atributos da classe.
     * 
     * @param dia recebe o dia.
     * @param mes recebe o mês.
     * @param ano recebe o ano.
     */
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
        if (ano > 0){
            this.ano = ano;
        } else {
            System.out.println("Ano inválido!");
        }
    }

    /**
     * Verifica se todos os atributos da classe receberam valor diferente de 0.
     * 
     * @return retorna se todos os valores da classe receberam algum valor.
     */
    private boolean dataCorreta(){
        return dia != 0 && mes != 0 && ano != 0;
    }
    
    /**
     * Retorna o número do dia referente a data atual do computador.
     * 
     * @return número do dia referente ao ano.
     */
    private int numeroDoDiaAtual(){
        return Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
    }

    /**
     * Retorna o dia atual, referente a data do computador.
     * 
     * @return dia atual.
     */
    private int diaAtual(){
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Retorna o mês atual, referente a data do computador.
     * 
     * @return mês atual
     */
    private int mesAtual(){
        return Calendar.getInstance().get(Calendar.MONTH) + 1;
    }

    /**
     * Retorna o ano atual, referente a data do computador.
     * 
     * @return ano atual.
     */
    private int anoAtual(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    /**
     * Retorna a hora atual, referente ao horário do computador.
     * 
     * @return hora atual.
     */
    private int horaAtual(){
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    /**
     * Retorna o número do dia referente ao ano do valor
     * armazenado no atributo dia da classe Aniversario,
     * 
     * @return numero do dia referente ao ano da data recebida
     */
    private int numeroDoDia(){
        int numeroDoDia = 0;
        for (int contDia = 0, contMes = 1; contMes < mes; contMes++){
            if (contMes < 8){
                if (contMes == 2){
                    if (bissexto(ano)){
                        contDia = 29;
                    }
                    else {
                        contDia = 28;
                    }
                } else if (contMes % 2 == 0){
                    contDia = 30;
                } else {
                    contDia = 31;
                }
            } else {
                if (contMes % 2 == 0){
                    contDia = 31;
                } else {
                    contDia = 30;
                }
            }
            for(int i = 0; i < contDia; i++){
                numeroDoDia++;
            }
        }
        return numeroDoDia + dia;
    }

    /**
     * Calcula e retorna o número de dias que se passaram 
     * após a data recebida.
     * 
     * @return número de dias que se passaram após a data.
     */
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

    /**
     * Calcula e retorna o número de meses que se passaram após 
     * a data recebida.
     * 
     * @return número de meses que se passaram após a data recebida.
     */
    public int mesesVividos(){
        if (mesAtual() > mes){
            return ((anoAtual() - ano) * 12) + (mesAtual() - mes);
        } else {
            return ((anoAtual() - ano) * 12) - (mes - mesAtual());
        }
    }

    /**
     * Calcula e retorna o número de anos que se passaram a após a data passada.
     * 
     * @return número de anos que se passaram após a data recebida.
     */
    public int anosVividos(){
        if (mes <= mesAtual() && diaAtual() >= dia)
            return anoAtual() - ano;
        else 
            return anoAtual() - ano - 1;
    }

    /**
     * Calcula o número de horas que se passou desdo dia passado até 
     * a data atual.
     * 
     * @return número de horas que se passaram.
     */
    public int horasVividas(){
        return (diasVividos() * 24) + horaAtual();
    }

    /**
     * Verifica e retorna se o ano passado por parâmetro é 
     * bissexto ou não.
     * 
     * @param ano deve ser passado de forma completa, sem abreviar.
     * @return se é bissexto ou não.
     */
    private boolean bissexto(int ano){
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }

    /**
     * Verifica se a data recebida é no futuro.
     * 
     * @return se a data é no futuro.
     */
    private boolean dataNoFuturo(){
        return (dia > diaAtual() && mes >= mesAtual() && ano >= anoAtual()) 
                || (ano > anoAtual()) || (mes > mesAtual() && ano > anoAtual());
    }

    /**
     * Sobreescrita do método toString() para imprimir os valores calculados,
     * como número de dias, meses, anos e horas que se passaram após a data 
     * atribuida aos atributos da classe dia, mes e ano.
     */
    @Override
    public String toString(){
        if (dataNoFuturo()){
           return("A data passada é no futuro, por favor digite uma data no passado...");
        } else if (dataCorreta()){
            String texto = "\nData: " + dia + "/" + mes + "/" + ano + "\n" +
                        "Data atual: " + diaAtual() + "/" + mesAtual() + "/" + anoAtual() + "\n\n" +
                        "Dias que se passaram: " + diasVividos() + "\n" +
                        "Meses que se passaram: " + mesesVividos() + "\n" +
                        "Anos que se passaram: " + anosVividos() + "\n" +
                        "Horas que se passaram: " + horasVividas() + "\n";
            return texto;
        } else {
            return("A data passada é inválida, coloque <dia> <mês> <ano> 'xx xx xxxx'");
        }
    }
}