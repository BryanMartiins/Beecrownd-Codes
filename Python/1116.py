N = int (input())

for i in range (1,N+1):
    X , Y = list(map(float,input().split()))

    if X == Y or Y == 0:
        print("divisao impossivel")
    else:
        soma = 0
        soma = X/Y
        print(soma)