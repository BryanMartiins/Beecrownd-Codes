A , B = list (map(int,input().split()))

if A == B and B == A:
    print ("O JOGO DUROU 24 HORA(S)")
else:
    if A > B:
        tempJogo = (24 - A) + B
        print (f"O JOGO DUROU {tempJogo} HORA(S)")
    else:
        tempJogo = B - A   
        print (f"O JOGO DUROU {tempJogo} HORA(S)")     