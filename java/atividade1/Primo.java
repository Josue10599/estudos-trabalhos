public class Primo{

    public void contaAte(int valor){
        for (int i = 1; i <= valor; i++)
            verificaPrimo(i);
    }

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