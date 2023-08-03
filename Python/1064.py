soma = 0
cont = 0
for i in range (0,6):

    X = float (input())

    if X > 0:
        soma+=X
        cont+=1

print (cont,"valores positivos")
print (f"{soma/cont:.1f}")