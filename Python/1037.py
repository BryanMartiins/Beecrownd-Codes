X = float (input ())

if X >= 0.0 and X <= 25.0:
    print ("Intervalo [0,25]")
elif X > 25.0 and X <= 50.0:
    print ("Intervalo (25,50]")   
elif X > 50.0 and X <= 75.0:
    print ("Intervalo (50,75]")
elif X > 75.0 and X <= 100.0:
    print ("Intervalo (75,100]")  
else: 
    print ("Fora de intervalo")          