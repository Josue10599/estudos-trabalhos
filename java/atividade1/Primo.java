/**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * Primo.java
 */
public class Primo{

    /**
     * Recebe um valor inteiro e conta até o valor passado por parâmetro,
     * caso algum dos valores durante a contagem for primo o número será
     * apresentado na tela.
     * 
     * @param valor  valor inteiro, que indica até onde será feita a contagem
     */
    public void contaAte(int valor){
        for (int i = 1; i <= valor; i++)
            verificaPrimo(i);
    }

    /**
     * Recebe um número inteiro por parâmetro e verifica se ele é primo,
     * caso o valor for primo o número é apresentado na tela.
     * 
     * @param numero valor inteiro que será verificado se é primo
     */
    private void verificaPrimo(int numero){
        int numeroDePrimos = 0;
        for (int i = 1; i < numero; i++){
            if (numero % i == 0)
                numeroDePrimos++;
        }
        if (numeroDePrimos == 1)
            System.out.println(numero);
    }
}