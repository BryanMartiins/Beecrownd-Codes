X = int(input())
Y = int(input())

maior = 0
menor = 0
soma=0

if X > Y:
    maior = X
    menor = Y

else:
    maior = Y
    menor = X    

for i in range (menor+1,maior):
    if i % 2 != 0:

      soma+=i


print(soma)