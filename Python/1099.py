N = int (input())

for i in range (0,N):
    X , Y = list(map(int,input().split()))
    soma = 0

    if X > Y:
        for j in range (Y+1,X):
            if j % 2:
                soma+=j

    else:
        for j in range (X+1,Y):
            if j % 2:
                soma+=j

    print(soma)
    