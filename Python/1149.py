soma = 0


A = list(map(int, input().split()))
B, N = 0, 0

for i in A:
    if i > 0:
        if B == 0:
            B = i
        else:
            N = i
            break

for K in range(0, N):
    soma += B + K
    K += 1
print(soma)
