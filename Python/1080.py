maior = 0 
posicao = 0

for i in range (1,101):

    X = int(input())

    if X > maior:
        maior = X
        posicao = i
i+=1


print(maior)
print(posicao)
