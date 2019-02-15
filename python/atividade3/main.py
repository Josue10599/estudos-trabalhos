# coding=utf-8
'''
  Este material foi criado com fins de estudos e aprendizagem,
 com o objetivo de divulgar e demonstrar os meus códigos e a
 minha evolução na área.
 
 Autor: Josue Lopes

 main.py
'''
from datetime import datetime

# Retorna a data atual do computador.
def diaAtual():
    return datetime.now().day

# Retorna o mês atual do computador.
def mesAtual():
    return datetime.now().month

# Retorna o ano atual do computador.
def anoAtual():
    return datetime.now().year

# Retorna a hora atual do computador.
def horaAtual():
    return datetime.now().hour

'''
 Retorna o número do dia passado referente ao ano,
 recebe a data por parâmetro (dia, mês e ano) para
 que possa retornar o valor.
'''
def numeroDoDia(dia, mes, ano):
    dias = 0
    n_dias = 0
    for n_mes in range (1, mes):
        if (n_mes < 8):
            if(n_mes == 2):
                if (bissexto(ano)):
                    n_dias = 29
                else:
                    n_dias = 28
            elif (n_mes % 2 == 0):
                n_dias = 30
            else:
                n_dias = 31
        else: 
            if (n_mes % 2 == 0):
                n_dias = 31
            else:
                n_dias = 30
        for cont_dias in range (n_dias):
            dias += 1
    return dias + dia

'''
 Recebe uma data por parâmetro (dia, mês e ano), para 
 que calcule e retorne o número de dias que se passaram
 após a data recebida.
'''
def diasVividos(dia, mes, ano):
    dias = 0
    for x in range(ano,anoAtual()):
        if (bissexto(x)):
            dias += 366
        else:
            dias += 365
    return dias - numeroDoDia(dia, mes, ano) + numeroDoDia(diaAtual(), mesAtual(), anoAtual())

# Recebe um ano e retorna se ele é bissexto
def bissexto(ano):
    return ((ano % 4 == 0) and ((ano % 100 != 0) or (ano % 400 == 0)))

'''
 Recebe o mês e o ano para calcular e retornar 
 o número de meses que se passaram.
'''
def mesesVividos(mes, ano):
    return (12 - mes) + ((anoAtual() - ano) * 12) - (12 - mesAtual())

'''
 Recebe o mês e o ano para calcular e retornar
 o número de anos que se passaram.
'''
def anosVividos(mes, ano):
    if (mesAtual() < mes):
        return anoAtual() - ano - 1
    else:
        return anoAtual() - ano

'''
 Recebe uma data por parâmetro (dia, mês e ano) e 
 retorna o número de horas que se passaram até o 
 presente momento.
'''
def horasVividas(dia, mes, ano):
    return diasVividos(dia, mes, ano) * 24 + horaAtual()

'''
 Ao iniciar o programa é solicitado uma data (no passado),
 o programa então apresenta no monitor o número de dias,
 meses, anos e horas que se passaram até o dia atual. 
'''

print("Digite a data para checar quantos dias se passaram")
dia = input("Dia: ")
mes = input("Mês: ")
ano = input("Ano: ")
print("Hoje é " + str(diaAtual()) + "/" + str(mesAtual()) + "/" + str(anoAtual()))
print("Data passada: " + str(dia) + "/" + str(mes) + "/" + str(ano))
print("Se passaram " + str(diasVividos(dia, mes, ano)) + " dias" )
print("Se passaram " + str(mesesVividos(mes, ano)) + " meses" )
print("Se passaram " + str(anosVividos(mes, ano)) + " anos" )
print("Se passaram " + str(horasVividas(dia, mes, ano)) + " horas" )