A , B , C = list (map(float,input().split()))

perimetro = A + B + C
area = (((A + B)* C) / 2)

if A + B > C and B + C > A and C + A > B:
    print (f"Perimetro = {perimetro:.1f}")

else:
    print (f"Area = {area:.1f}")