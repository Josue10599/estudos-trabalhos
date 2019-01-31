#include "palindrome.h"

int main(void){

    int minimo, maximo;

    printf("Digite o intervalo de números ");
    scanf("%d %d", &minimo, &maximo);

    if (minimo == maximo){
        printf("Não foi digitado um intervalo de números");
    } else {
        if (maximo < minimo){
            int aux = maximo;
            maximo = minimo;
            minimo = aux;
        }
        if (minimo == 0){
            minimo++;
        }
        while (minimo <= maximo){
            if (palindromeNumero(minimo)){
                printf("%d ",minimo);
            }
            minimo++;
        }
    }
    printf("\n");
    return 0;
}