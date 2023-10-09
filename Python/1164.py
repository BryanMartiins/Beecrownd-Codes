soma = 0
i = 0
N = 0
X = 0
N = int(input())
for j in range(0, N):
    X = int(input())
    for i in range(1, X):
        

        if X % i == 0:
            soma += i

    if soma == X:
        print(f"{soma} eh perfeito")
    else:
        print(f"{X} nao eh perfeito")
    soma = 0
