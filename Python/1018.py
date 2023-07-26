totalMoney = int (input())

cem = totalMoney // 100
cinq = totalMoney % 100 // 50
vint = totalMoney % 100 % 50 // 20
dez = totalMoney % 100 % 50 % 20 // 10
cinc = totalMoney % 100 % 50 % 20 % 10 // 5
dois = totalMoney % 100 % 50 % 20 % 10 % 5 // 2
um = totalMoney % 100 % 50 % 20 % 10 % 5 % 2

print(totalMoney)
print (cem,"nota(s) de R$ 100,00")
print (cinq,"nota(s) de R$ 50,00")
print (vint,"nota(s) de R$ 20,00")
print (dez,"nota(s) de R$ 10,00")
print (cinc,"nota(s) de R$ 5,00")
print (dois,"nota(s) de R$ 2,00")
print (um,"nota(s) de R$ 1,00")

