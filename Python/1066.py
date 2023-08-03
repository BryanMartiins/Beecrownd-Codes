par = 0
impar = 0
positivo = 0
negativo = 0

for i in range (0 , 5):
    X = float (input())
    if X % 2 == 0:
        par += 1

    if X % 2 != 0:
        impar +=1

    if  X > 0:
        positivo += 1

    if X < 0:
        negativo+=1

print(par,"valor(es) par(es)")
print(impar,"valor(es) impar(es)")
print(positivo,"valor(es) positivo(s)")
print(negativo,"valor(es) negativo(s)")

