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
  * Ao iniciar o programa é solicitado o intervalo de números que será realizada
  * a checagem dos valores palíndromes, se um número for palíndrome ele será 
  * apresentado na tela.
  */
public class Principal {
    public static void main (String[] args){
        String inicio = System.console().readLine("A verificação de números palindromes, começa em: ");
        String fim = System.console().readLine("e termina em: ");
        System.out.println("Esses são os números palindromes no intervalo digitado {");
        new Palindrome().contaAte(Integer.parseInt(inicio), Integer.parseInt(fim));
        System.out.println("}");
    }
}