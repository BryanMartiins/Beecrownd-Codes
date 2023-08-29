anterior = proximo = 0
atual = 1

X = int (input())

for i in range (1,X+1):
    if i == X:
        print(anterior)
    else:
        print(f"{anterior} ",end="")
        proximo = atual + anterior
        anterior = atual
        atual = proximo