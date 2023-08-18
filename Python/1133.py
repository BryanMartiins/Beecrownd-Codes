aux = 0
X = int (input())
Y = int (input())

if X > Y:
    aux = Y
    Y = X
    X = aux
   

for i in range (X+1,Y):
    if i % 5 == 3 or i % 5 == 2:
        print(i)
    i+=1


