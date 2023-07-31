import sys
A , B , C = list (map(float,input().split()))

if B > A and B > C:
    aux = B
    B = A
    A = aux

if C > A and C > B:
    aux = C
    C = A
    A = aux

if A >= B + C:
    print ("NAO FORMA TRIANGULO")
    sys.exit()

if A * A == (B * B + C * C):
    print ("TRIANGULO RETANGULO")

if A * A > ((B * B) + (C * C)):
    print ("TRIANGULO OBTUSANGULO")
    

if A * A < ((B * B) + (C * C)):
    print ("TRIANGULO ACUTANGULO")
    

if A == B and B == C:
    print ("TRIANGULO EQUILATERO")
    sys.exit()

if A == B or B == C or C == A:
    print ("TRIANGULO ISOSCELES")