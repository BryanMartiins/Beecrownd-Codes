primo = 0

N = int(input())

for i in range(0, N):
    X = int(input())
    flag = True
    for j in range(2, X//2 + 1):
        if X % j == 0:
            flag = False
            break
        j += 1

    if flag == True:
        print(f"{X} eh primo")
    else:
        print(f"{X} nao eh primo")
