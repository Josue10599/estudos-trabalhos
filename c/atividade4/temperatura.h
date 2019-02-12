 /**
 *  Este material foi criado com fins de estudos e aprendizagem,
 * com o objetivo de divulgar e demonstrar os meus códigos e a
 * minha evolução na área.
 * 
 * Autor: Josue Lopes
 * 
 * temperatura.h
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

// Recebe a temperatura em Celsius e converte ela para a escala de Fahrenheit
float celsiusToFahrenheit(float celsius);

// Recebe a temperatura em Celsius e converte ela para a escala de Kelvin
float celsiusToKelvin(float celsius);

// Recebe a temperatura em Fahrenheit e converte ela para a escala de Kelvin
float fahrenheitToKelvin(float fahrenheit);

// Recebe a temperatura em Fahrenheit e converte ela para a escala de Celsius
float fahrenheitToCelsius(float fahrenheit);

// Recebe a temperatura em Kelvin e converte ela para a escala de Celsius
float kelvinToCelsius(float kelvin);

// Recebe a temperatura em Kelvin e converte ela para a escala de Fahrenheit
float kelvinToFahrenheit(float kelvin);