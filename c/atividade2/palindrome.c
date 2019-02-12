 /**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * palindrome.c
 */

#include "palindrome.h"

bool palindromeNumero(int numero){
    int resto, valor, invertido;
    for(resto = 0, valor = numero, invertido = 0; valor > 0; valor /= 10){
        resto = valor % 10;
        invertido = (invertido*10) + resto;
    }
    return (invertido == numero);
}

bool palindromePalavra(char *palavra){
    char invertido[sizeof(palavra)];
    int correVetor;

    for (correVetor = 0; correVetor < sizeof(palavra); correVetor++){
        invertido[correVetor] = palavra[(sizeof(palavra)- (correVetor + 1))];
    }
    return (strncmp(palavra,invertido,sizeof(palavra)) == 0);
}