codLanche , quantidade = list (map(int,input().split()))
valorTotal = 0

if codLanche == 1:
    cachoQuente = 4
    valorTotal = cachoQuente*quantidade
    print(f"Total: R$ {valorTotal:.2f}")

elif codLanche == 2:
    salada = float (4.5)
    valorTotal = salada*quantidade
    print (f"Total: R$ {valorTotal:.2f}")

elif codLanche == 3:
    bacon = 5
    valorTotal = bacon*quantidade
    print (f"Total: R$ {valorTotal:.2f}")

elif codLanche == 4:
    torrada = 2
    valorTotal = torrada*quantidade
    print (f"Total: R$ {valorTotal:.2f}")
    
else:
    refri = float (1.5)
    valorTotal = refri*quantidade
    print (f"Total: R$ {valorTotal:.2f}")   



