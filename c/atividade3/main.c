#include "aniversario.h"

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
