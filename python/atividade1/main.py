'''
  Este material foi criado com fins de estudos e aprendizagem,
 com o objetivo de divulgar e demonstrar os meus códigos e a
 minha evolução na área.
 
 Autor: Josue Lopes

 main.py
'''

'''
 Função que verifica e imprime se o valor passado 
 na variável "n" é um número primo ou não.
'''
def primo(n):
        cont = 0
        for i in range(1,n):
                if (n % i == 0):
                        cont +=1
        if (cont == 1):
                print(n)
'''
 Função que realiza a contagem de 1 
 até o valor passado por parâmetro,
 enquanto conta é realizada a checagem
 se o valor é primo ou não.
'''
def conta(n):
        for i in range(1,n + 1):
                primo(i)

conta(10000)