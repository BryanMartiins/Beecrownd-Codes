while True:
    soma = 0
    X = int(input())

    if X >= 1:
        if X % 2 != 0:
            X += 1 
        else:
            X += 0

        for j in range(5):
            
            soma += X
            X += 2
            

        print(soma)

    else:
        break
