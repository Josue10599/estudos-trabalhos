# coding=utf-8
from datetime import datetime

def diaAtual():
    return datetime.now().day

def mesAtual():
    return datetime.now().month

def anoAtual():
    return datetime.now().year

def horaAtual():
    return datetime.now().hour

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

def diasVividos(dia, mes, ano):
    dias = 0
    for x in range(ano,anoAtual()):
        if (bissexto(x)):
            dias += 366
        else:
            dias += 365
    return dias - numeroDoDia(dia, mes, ano) + numeroDoDia(diaAtual(), mesAtual(), anoAtual())

def bissexto(ano):
    return ((ano % 4 == 0) and ((ano % 100 != 0) or (ano % 400 == 0)))

def mesesVividos(mes, ano):
    return (12 - mes) + ((anoAtual() - ano) * 12) - (12 - mesAtual())

def anosVividos(mes, ano):
    if (mesAtual() < mes):
        return anoAtual() - ano - 1
    else:
        return anoAtual() - ano

def horasVividas(dia, mes, ano):
    return diasVividos(dia, mes, ano) * 24 + horaAtual()

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