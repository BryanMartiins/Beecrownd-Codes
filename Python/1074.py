N = int (input())

for i in range (0,N):
    X = int (input())

    if X % 2 == 0 and X != 0 :
        print ("EVEN ",end="")
    if X % 2 != 0:
        print("ODD ",end="")
    if X >= 1:
        print ("POSITIVE",)
    if X <= -1:
        print("NEGATIVE",)
    if X == 0:
        print ("NULL")