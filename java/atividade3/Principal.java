/**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * Principal
 */

 /**
  * Ao iniciar o programa é solicitada para que o usuário digite uma
  * data (no passado) e será calculado quantos dias, meses, anos e horas
  * se passaram.
  */
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