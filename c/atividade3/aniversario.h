#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <time.h>

void aniversario (int dia, int mes, int ano);

//Retorna o número de dias que passou no ano até a data passada na função aniversário()
int numeroDoDiaQueNasceu(int dia, int mes);

//Retorna o número de dias que se passou após a data passada na função aniversário()
int numeroDeDias(int numeroDoDiaQueNasceu, int anoQueNasceu);

//Retorna o número de meses que se passou após a data passada na função aniversário()
int numeroDeMeses(int numeroDoMesQueNasceu, int anoQueNasceu);

//Retorna o número de anos que se passou após a data passada na função aniversário()
int numeroDeAnos(int anoQueNasceu, int mes, int dia);

//Retorna o números de horas que se passou após a data estipulada e com o momento em que passou os dados na função aniversário()
int numeroDeHoras(int diasVividos);

//Retorna o dia atual do computador
int diaAtual();

//Retorna o mês atual do computador
int mesAtual();

//Retorna o ano atual do computador
int anoAtual();

//Retorna o número de dias que já passou no ano
int numeroDoDiaAtual();

//Retorna uma struct com os valores de data e hora
struct tm dataeTempo();