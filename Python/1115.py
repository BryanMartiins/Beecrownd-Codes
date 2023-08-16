while True:

    X , Y = list(map(int,input().split()))

    if X>= 1 and Y >= 1:
        print("primeiro")
            
    elif X <= -1 and Y >=1:
        print("segundo")   
    elif X<=-1 and Y <=-1:
        print("terceiro")
    elif X>=1 and Y<=-1:
        print("quarto")
    else:
        break