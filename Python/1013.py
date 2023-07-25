A , B , C = list(map(int,input().split()))

if A > B and A > C:
    print (A,"eh o maior")
elif B > C:
    print(B,"eh o maior")
else:
    print (C,"eh o maior")