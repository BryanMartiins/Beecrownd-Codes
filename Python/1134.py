Alcool = 0
Gasolina = 0
Diesel = 0



while True:
    tipCombustivel = int(input())

    if tipCombustivel == 1:
        Alcool+=1
    elif tipCombustivel == 2:
        Gasolina+=1
    elif tipCombustivel == 3:
        Diesel+=1
    elif tipCombustivel == 4:
        break

print("MUITO OBRIGADO")
print(f"Alcool: {Alcool}")
print(f"Gasolina: {Gasolina}")
print(f"Diesel: {Diesel}")