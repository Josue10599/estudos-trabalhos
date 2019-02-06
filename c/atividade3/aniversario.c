#include "aniversario.h"

void aniversario (int dia, int mes, int ano){
    int diasVividos = numeroDeDias(numeroDoDiaQueNasceu(dia,mes), ano);
    int mesesVividos = numeroDeMeses(mes, ano);
    int anosVividos = numeroDeAnos(ano, mes, dia);
    int horasVididas = numeroDeHoras(diasVividos);
    printf("Data Atual: %d/%d/%d \n", diaAtual(), mesAtual(), anoAtual());
    printf("Data: %d/%d/%d \n", dia, mes, ano);
    printf("Número de dias vividos: %d \n", diasVividos);
    printf("Número de meses vividos: %d \n", mesesVividos);
    printf("Número de anos vividos: %d \n", anosVividos);
    printf("Número de horas vividas: %d \n", horasVididas);
}

int numeroDoDiaQueNasceu(int dia, int mes){
    int contDia, contMes, dias = 1;
    for (contDia = 1, contMes = 1, dias = 1; contMes != mes || contDia != dia; contDia++, dias++){
        if (contMes < 8){
            if (contMes % 2 == 0){
                if (contDia == 30){
                    contDia = 0;
                    contMes++;
                }
            } else if (contDia == 31) {
                contDia = 0;
                contMes++;
            }
        } else {
            if (contMes % 2 == 0){
                if (contDia == 31){
                    contDia = 0;
                    contMes++;
                }
            } else if (contDia == 30){
                contDia = 0;
                contMes++;
            }
        }
    }
    return dias;
}

int numeroDeDias(int numeroDoDiaQueNasceu, int anoQueNasceu){
    int dias = 1, i;
    for(i = anoQueNasceu; i < anoAtual(); i++){
        if (((i % 4 == 0) || (i % 400 == 0)) && (i % 100 != 0)){
            dias += 366;
        } else {
            dias += 365;
        }
    }
    return numeroDoDiaAtual() - numeroDoDiaQueNasceu + dias;
}

int numeroDeMeses(int numeroDoMesQueNasceu, int anoQueNasceu){
    if (mesAtual() > numeroDoMesQueNasceu){
        return ((anoAtual() - anoQueNasceu) * 12) + (mesAtual() - numeroDoMesQueNasceu);
    }        
    else
    {
        return ((anoAtual() - anoQueNasceu) * 12) - (numeroDoMesQueNasceu - mesAtual());
    }
    
}

int numeroDeAnos(int anoQueNasceu, int mes, int dia){
    if (mes <= mesAtual() && diaAtual() >= dia)
        return anoAtual() - anoQueNasceu;
    else 
        return anoAtual() - anoQueNasceu - 1;
}

int numeroDeHoras(int diasVividos){
    struct tm data = dataeTempo();
    return diasVividos * 24 + data.tm_hour;
}

int diaAtual(){
    struct tm dia = dataeTempo();
    return dia.tm_mday;
}

int mesAtual(){
    struct tm mes = dataeTempo();
    return mes.tm_mon + 1;    
}

int anoAtual(){
    struct tm ano = dataeTempo();    
    return ano.tm_year + 1900;
}

int numeroDoDiaAtual(){
    struct tm dias = dataeTempo();
    return dias.tm_yday;
}

struct tm dataeTempo(){
    time_t tempo;
    time(&tempo);
    struct tm data = *localtime(&tempo);
    return data;
}