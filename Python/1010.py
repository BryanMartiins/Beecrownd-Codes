cod1 , numP1 ,valorP1 = list(map(float,input().split())) 
cod2 , numP2 , valorP2 = list(map(float,input().split()))

toTalP1 = numP1*valorP1
toTalP2 = numP2*valorP2

TotalPagar = toTalP1+toTalP2

print (f"VALOR A PAGAR: R$ {TotalPagar:.2f}")


