while True:
    try:
        soma = 0
        X, Y = list(map(int,input().split()))

        if X <= 0 or Y <= 0:
            break
        
        elif X > Y :
            
            for i in range (Y,X+1):

                soma +=i
                print (f"{i:d} ",end="")
                i+=1

            print (f"Sum={soma:d}") 
       
        else:
            for i in range (X,Y+1):
                soma+=i
                print (f"{i:d} ",end="")
                i+=1

            print (f"Sum={soma:d}")    

    except EOFError:
        break