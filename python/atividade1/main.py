def primo(n):
        cont = 0
        for i in range(1,n):
                if (n % i == 0):
                        cont +=1
        if (cont == 1):
                print(n)

def conta(n):
        for i in range(1,n + 1):
                primo(i)

conta(10000)