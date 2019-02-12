/**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * primos.c
 */

#include "primos.h"

void primo (int valor) {
    int numero, nPrimos = 0;
    for(numero = 1; numero < valor; numero++) {
        if (valor % numero == 0){
            nPrimos++;
        }
    }
    if (nPrimos == 1){
        printf("%d \n",valor);
    }
}

void conta (int numero) {
    int valor;
    for (valor = 1; valor <= numero; valor++) {
        primo(valor);
    }
}