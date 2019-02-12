#include "temperatura.h"

void minusculo(char *palavra){
    int i;
    for(i = 0; i < strlen(palavra); i++){
        palavra[i] = tolower(palavra[i]);
    }
}

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

int main(void){
    while(true){
        if (!entradaDeDados()){
            printf("\nOs dados passados são inválidos... tente novamente...\n");
        }
    }   
    return 1;
}