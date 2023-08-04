N = int (input())
positiv = 0
negativ = 0
for i in range (0, N):
    X = int (input())

    if X > 9 and X < 21:
        positiv += 1
    else:
        negativ += 1

print (positiv,"in")
print (negativ,'out')