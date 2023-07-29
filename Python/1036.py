a, b, c = list (map(float,input().split()))

delta = (b ** 2  - 4*a*c)



if delta <= 0:
    print ("Impossivel calcular")
    breakpoint
elif a == 0:
    print ("Impossivel calcular")
    breakpoint
else:

    r1 = (-b+(delta**(1/2)))/(2*a)
    r2 = (-b-(delta**(1/2)))/(2*a)
    print (f"R1 = {r1:.5f}")
    print (f"R2 = {r2:.5f}")    
