A , B , C = list(map(float,input().split()))

trianguloRetan = (A * C) / 2
areaCirc = (C**2) * 3.14159
areaTrap = ((A + B)* C) /2
areaQuad = B * B
areaRetangulo = A * B 


print (f"TRIANGULO: {trianguloRetan:.3f}")
print (f"CIRCULO: {areaCirc:.3f}")
print (f"TRAPEZIO: {areaTrap:.3f}")
print (f"QUADRADO: {areaQuad:.3f}")
print (f"RETANGULO: {areaRetangulo:.3f}")