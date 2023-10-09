N = int(input())

for i in range(N):
    years = 0
  
    PA, PB, G1, G2 = list(map(float, input().split()))

    PA = int(PA)
    PB = int(PB)
   
    while PA <= PB:

        PA += PA * int((G1 / 100))
        PB += PB * int((G2 / 100))

        years += 1

    if years < 101:
        print(f"{years} anos.")
        

    else:
        print("Mais de 1 seculo.")

        
