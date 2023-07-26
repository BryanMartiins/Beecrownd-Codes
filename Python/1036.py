a, b, c = list (map(float,input().split()))

delta = (b * b ) - (4*a*c)

r1 = float (-b+((delta**(1/2))/(2*a)))
r2 = float (-b-((delta**(1/2))/(2*a)))

if delta <= 0:
    print ("Impossivel calcular")
elif a == 0:
    print ("Impossivel calcular")
else:
    print (f"R1 ={r1:.5f}")
    print (f"R2 ={r2:.5f}")    
