 /**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * palindrome.h
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

/**
 * Recebe um valor inteiro e verifica se o número 
 * passado é palíndrome, ou seja, a leitura tanto 
 * da esquerda para direita como da direita para
 * esquerda é o mesmo valor.
 * 
 * Caso o valor for palíndrome é retornado true.
 * 
 * Por exemplo: 
 * 
 *      232 = true
 *      122 = false
 */
bool palindromeNumero(int numero);

/**
 * Recebe um valor char e verifica se a palavra é palindrome, 
 * ou seja, a leitura tanto da esquerda para direita
 * como da direita para esquerda é o mesmo valor.
 * 
 * Caso o valor for palíndrome é retornado true.
 * 
 * Por exemplo:
 * 
 *      ama = true
 *      nao = false
 */
bool palindromePalavra(char *palavra);