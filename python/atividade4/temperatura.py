# coding=utf-8
'''
  Este material foi criado com fins de estudos e aprendizagem,
 com o objetivo de divulgar e demonstrar os meus códigos e a
 minha evolução na área.
 
 Autor: Josue Lopes

 temperatura.py
'''
class Temperatura:
    # Verifica se a escala passada existe.
    def checaEscala(self, escala):
        return checaEscalaCelsius(escala) or checaEscalaFahrenheit(escala) or checaEscalaKelvin(escala)

    # Recebe a escala e converte para a temperatura desejada.
    def converteTemperatura(self, escala, temperatura):
        print("------------------------------------------")
        if (checaEscalaCelsius(escala)):
            print("Temperatura em Celsius: " + str(temperatura))
            print("Temperatura em Fahrenheit: " + str(celsiusToFahrenheit(temperatura)))
            print("Temperatura em Kelvin: " + str(celsiusToKelvin(temperatura)))
        elif (checaEscalaFahrenheit(escala)):
            print("Temperatura em Fahrenheit: " + str(temperatura))
            print("Temperatura em Celsius: " + str(fahrenheitToCelsius(temperatura)))
            print("Temperatura em Kelvin: " + str(fahrenheitToKelvin(temperatura)))
        elif (checaEscalaKelvin(escala)):
            print("Temperatura em Kelvin: " + str(temperatura))
            print("Temperatura em Celsius: " + str(kelvinToCelsius(temperatura)))
            print("Temperatura em Fahrenheit: " + str(kelvinToFahrenheit(temperatura)))
        else:
            print("ERRO : Escala incorreta!")
        print("------------------------------------------")

#END CLASS

# Converte a temperatura na escala Celsius para Kelvin
def celsiusToKelvin(celsius):
    return (celsius + 273.15)

# Converte a temperatura na escala Celsius para Fahrenheit.
def celsiusToFahrenheit(celsius):
    return ((celsius*9/5) + 32)

# Converte a temperatura na escala Fahrenheit para a escala Celsius.
def fahrenheitToCelsius(fahrenheit):
    return ((fahrenheit - 32) * 5/9)

# Converte a temperatura na escala Fahrenheit para a escala Kelvin.
def fahrenheitToKelvin(fahrenheit):
    return ((fahrenheit - 32) * 5/9 + 273.15)

# Converte a temperatura na escala Kelvin para Celsius.
def kelvinToCelsius(kelvin):
    return (kelvin - 273.15)

# Converte a temperatura na escala Kelvin para Fahrenheit.
def kelvinToFahrenheit(kelvin):
    return ((kelvin - 273.15) * 9/5 + 32)

# Verifica se é a escala Celsius.
def checaEscalaCelsius(escala):
    return (escala == "1" or escala.lower() == "celsius" or escala.lower() == "1-celsius")

# Verifica se é a escala Fahrenheit
def checaEscalaFahrenheit(escala):
    return (escala == "2" or escala.lower() == "fahrenheit" or escala.lower() == "2-fahrenheit")

# Verifica se é a escala Kelvin
def checaEscalaKelvin(escala):
    return (escala == "3" or escala.lower() == "kelvin" or escala.lower() == "3-kelvin")