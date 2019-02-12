 /**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * main.c
 */

#include "temperatura.h"

void minusculo(char *palavra);
bool entradaDeDados();

/**
 * Ao iniciar o programa é solicitado qual escala de temperatura o usuário
 * deseja utilizar (Kelvin, Fahrenheit e Celsius), depois é solicitado a
 * temperatura que deverá ser convertida para as outras escalas e por fim 
 * apresenta na tela a temperatura de todas as escalas e o processo reinicia, 
 * solicitando novamente a escala que o usuário deseja trabalhar
 */
int main(void){
    while(true){
        if (!entradaDeDados()){
            printf("\nOs dados passados são inválidos... tente novamente...\n");
        }
    }   
    return 1;
}

// Converte todas letras maiusculas de um vetor char (string) em minusculas
void minusculo(char *palavra){
    int i;
    for(i = 0; i < strlen(palavra); i++){
        palavra[i] = tolower(palavra[i]);
    }
}

/**
 * Função para a entrada de dados, caso ocorrer alguma entrada indevida
 * é retornado o valor false.
 */
bool entradaDeDados(){
    char palavra[20];
    float temperatura;
    printf("\nQual escala você deseja passar a temperatura?\n");
    printf("\n1-Celsius\n2-Fahrenheit\n3-Kelvin\n");
    printf("(Digite o nome da escala ou o número)\n\n");
    scanf("%s", palavra);
    minusculo(palavra);
    if (strcmp(palavra, "celsius") == 0 || strcmp(palavra, "1") == 0 || strcmp(palavra, "1-celsius") == 0){
        printf("\nDigite a temperatura em graus Celsius: ");
        scanf("%f", &temperatura);
        printf("\nCelsius: %f\nFahrenheit: %f\nKelvin: %f\n", 
            temperatura, celsiusToFahrenheit(temperatura), celsiusToKelvin(temperatura));
        return true;
    } else if (strcmp(palavra, "fahrenheit") == 0 || strcmp(palavra, "2") == 0 
                || strcmp(palavra, "2-fahrenheit") == 0){
        printf("\nDigite a temperatura em Fahrenheit: ");
        scanf("%f", &temperatura);
        printf("\nFahrenheit: %f\nCelsius: %f\nKelvin: %f\n",
            temperatura, fahrenheitToCelsius(temperatura), fahrenheitToKelvin(temperatura));
        return true;
    } else if (strcmp(palavra, "kelvin") == 0 || strcmp(palavra, "3") == 0 
                || strcmp(palavra, "3-kelvin") == 0){
        printf("\nDigite a temperatura em Kelvin: ");
        scanf("%f", &temperatura);
        printf("\nKelvin: %f\nCelsius: %f\nFahrenheit: %f\n",
            temperatura, kelvinToCelsius(temperatura), kelvinToFahrenheit(temperatura));
        return true;
    }
    return false;
}