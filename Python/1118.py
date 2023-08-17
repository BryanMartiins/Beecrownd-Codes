while True: 
    media = 0
    nota1 = float (input())

    while nota1 < 0 or nota1 > 10:

        print("nota invalida")
        nota1 = float (input())
    
    nota2 = float(input())

    while nota2 < 0 or nota2 > 10:
        
        print("nota invalida")
        
        nota2 = float (input())
        
    media = (nota1 + nota2)/2
    print(f"media = {media:.2f}")
    
    ver = 1 
    while True:

        print("novo calculo (1-sim 2-nao)")
        opcao = float (input())

        if opcao == 2:
            ver = 2
            break
        elif opcao == 1:
            break
    if ver == 2:
        break