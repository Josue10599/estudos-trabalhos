# coding=utf-8
'''
  Este material foi criado com fins de estudos e aprendizagem,
 com o objetivo de divulgar e demonstrar os meus códigos e a
 minha evolução na área.
 
 Autor: Josue Lopes

 main.py
'''

from temperatura import Temperatura

continua = True
while(continua):
    classe = Temperatura()
    escala = str(input("Digite qual escala deseja utilizar?\n1-Celsius\n2-Fahrenheit\n3-Kelvin\n0-Sair\n"))
    if (classe.checaEscala(escala)):
        classe.converteTemperatura(escala, input("Digite a temperatura: "))
    elif (escala == "0" or escala.lower() == "sair" or escala.lower() == "0-sair"):
        print("Saindo...")
        continua = False
    else:
        print("Escala inválida, digite novamente...")
