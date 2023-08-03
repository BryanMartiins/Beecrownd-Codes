renda = float (input())

if renda <= 2000:
    print ("Isento")

elif renda > 2000 and renda < 3001:
    liquid = (renda - 2000) * 0.08
    print (f"R$ {liquid:.2f}")

elif renda > 3000 and renda < 4501:
    liquid = (renda - 3000) * 0.18 + (1000*0.08)
    print (f"R$ {liquid:.2f}")

else:
    liquid = (renda - 4500) * 0.28 + (1500 *0.18) + (1000* 0.08)
    print (f"R$ {liquid:.2f}")

