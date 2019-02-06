public class Principal {
    public static void main (String[] args){
        String inicio = System.console().readLine("A verificação de números palindromes, começa em: ");
        String fim = System.console().readLine("e termina em: ");
        System.out.println("Esses são os números palindromes no intervalo digitado {");
        new Palindrome().contaAte(Integer.parseInt(inicio), Integer.parseInt(fim));
        System.out.println("}");
    }
}