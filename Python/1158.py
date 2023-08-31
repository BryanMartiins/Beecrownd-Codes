N = int(input())

for i in range (1,N+1):
    soma = 0
    X , Y = list(map(int,input().split()))

    if X % 2 == 0:
        X+=1

    for k in range (Y):
       soma +=X
       X +=2
  
       
    print(soma)

    
   

