/**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * Palindrome
 */

public class Palindrome {

    /**
     * Recebe um valor por parâmetro e verifica se o mesmo é palindrome, ou
     * seja, é possível ler nos dois sentidos (da esquerda para direita e
     * da direita para a esquerda) que o resultado é o mesmo.
     * 
     * @param numero número inteiro onde será checado se o valor é palindrome
     * @return retorna se o número passado por parâmetro é palindrome
     */
    private boolean numeroPalindrome(int numero){
        int invertido = 0, valor = numero;
        while (valor > 0){
            invertido *= 10;
            invertido += valor % 10;
            valor /= 10;
        }
        return invertido == numero;
    }

    /**
     * Recebe um intervalo númerico, onde será checado os valores
     * dentro deste intervalo e serão apresentados os números palíndromes
     * 
     * @param de valor inicial do intervalo
     * @param ate valor final do intervalo
     */
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