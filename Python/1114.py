while True:
    try:
        senha = int(input())

        if senha != 2002:
            print ("Senha Invalida")
        else:
            print ("Acesso Permitido")    
            break

    except EOFError:
        break