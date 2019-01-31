public class Palindrome {

    private boolean numeroPalindrome(int numero){
        int invertido = 0, valor = numero;
        while (valor > 0){
            invertido *= 10;
            invertido += valor % 10;
            valor /= 10;
        }
        return invertido == numero;
    }

    public void contaAte(int de, int ate){
            if (ate < de){
                int aux = ate;
                ate = de;
                de = aux;
            }
            for (; de <= ate; de++){
                if (numeroPalindrome(de))
                    System.out.print(de + " ");
            }
            System.out.println();
    }

}