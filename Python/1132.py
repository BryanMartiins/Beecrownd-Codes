soma = 0

X = int (input())
Y = int (input())

if X > Y:
    for i in range (Y,X+1):
        if i % 13 != 0:
            soma+=i
            i+=1

else:
    for i in range (X,Y+1):
        if i % 13 != 0:
            soma+=i
            i+=1

print(soma)