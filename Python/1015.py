x1 , y1 = list(map(float,input().split()))
x2 , y2 = list(map(float,input().split()))

distacia =( (x2 - x1)**2 + (y2 - y1)**2)**(1/2)

print (f"{distacia:.4f}")


