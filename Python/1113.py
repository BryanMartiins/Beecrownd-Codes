while True:
    try:
        X, Y = list(map(int,input().split()))

        if X > Y:
            print ("Decrescente")

        elif X < Y:
            print ("Crescente")
        else:
            break
            
    except EOFError:
        break