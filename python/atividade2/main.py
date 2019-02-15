# coding=utf-8
'''
  Este material foi criado com fins de estudos e aprendizagem,
 com o objetivo de divulgar e demonstrar os meus códigos e a
 minha evolução na área.
 
 Autor: Josue Lopes

 main.py
'''

'''
 Função que recebe um intervalo de valores,
 sendo passado o início e termino e realiza
 a contagem do começo ao fim.
'''
def conta (inicio, termino) :
    for numero in range(inicio - 1, termino + 1) :
        palindrome(numero)

'''
 Verifica se o valor passado por parâmetro é 
 número primo ou não, caso seja número primo o
 valor é apresentado na tela.
'''
def palindrome (numero) :
    valor = numero
    invertido = 0
    while (valor > 0) :
        invertido *= 10
        invertido += valor % 10
        valor /= 10
    if (numero == invertido) :
        print(numero)
  
'''
 Ao iniciar o programa é solicitado um intervalo numérico 
 para que seja apresentado os valores palindromes neste meio.
'''
print("Digite um intervalo de números para se procurar os números palíndromes")
inicio = input('Começa em: ')
termino = input('Termina em: ')
conta(inicio, termino)