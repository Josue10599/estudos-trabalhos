 /**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * temperatura.c
 */

#include "temperatura.h"

float celsiusToFahrenheit(float celsius){
    return ((float)(celsius*9/5) + 32);
}

float celsiusToKelvin(float celsius){
    return celsius + 273.15;
}

float fahrenheitToKelvin(float fahrenheit){
    return ((float)(fahrenheit - 32) * 5/9 + 273.15);
}

float fahrenheitToCelsius(float fahrenheit){
    return ((float)(fahrenheit - 32) * 5/9);
}

float kelvinToCelsius(float kelvin){
    return kelvin - 273.15;
}

float kelvinToFahrenheit(float kelvin){
    return ((float)(kelvin - 273.15) * 9/5 + 32);
}