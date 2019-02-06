public class Principal{
    public static void main(String[] args){
        System.out.println("Digite a data: ");
        int dia = Integer.parseInt(System.console().readLine("Dia: "));
        int mes = Integer.parseInt(System.console().readLine("Mês: "));
        int ano = Integer.parseInt(System.console().readLine("Ano: "));
        Aniversario data = new Aniversario(dia, mes, ano);
        System.out.println(data.toString());
    }
}