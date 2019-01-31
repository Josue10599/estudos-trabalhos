# coding=utf-8
def conta (inicio, termino) :
    for numero in range(inicio - 1, termino + 1) :
        palindrome(numero)

def palindrome (numero) :
    valor = numero
    invertido = 0
    while (valor > 0) :
        invertido *= 10
        invertido += valor % 10
        valor /= 10
    if (numero == invertido) :
        print(numero)
  
print("Digite um intervalo de números para se procurar os números palíndromes")
inicio = input('Começa em: ')
termino = input('Termina em: ')
conta(inicio, termino)