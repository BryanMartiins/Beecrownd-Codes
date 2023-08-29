media, cont = 0,0



while True:
    idade = int (input())

    if idade < 0:
        break

    media += idade
    cont+=1
print(f"{media/cont:.2f}")