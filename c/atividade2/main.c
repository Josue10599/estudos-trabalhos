 /**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * main.c
 */

#include "palindrome.h"

/**
 * Assim que o programa é iniciado é solicitado um intervalo númerico,
 * será realizada uma varredura nos valores dentro deste intervalo
 * procurando os valores palíndromes, quando encontra um esse valor é
 * apresentado na tela.
 */
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
    return 1;
}