 /**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * main.c
 */

#include "aniversario.h"

/**
 * Ao iniciar o programa uma data é solicitada, ao receber a data é contado 
 * os números de dias, meses, anos e horas que se passaram até o dia que o programa
 * está sendo executado no computador.
 */
int main(){
    int dia, mes, ano;

    printf("Digite a data para ver quanto tempo se passou após ela (Exemplo: 10 05 1999): ");
    scanf("%d %d %d", &dia, &mes, &ano);
    if (dia <= 31 && mes <= 12 && ano >= 0) 
    {
        aniversario(dia, mes, ano);
    }
    else
    {
        printf("Data inválida!");
    }
    
    return 1;
}
