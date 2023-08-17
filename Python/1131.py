gremio = 0
inter = 0
grenal = 1
empate = 0
while True:
  
    I, G = list(map(int,input().split()))

    if G > I:
        gremio +=1
    elif I > G:
        inter +=1
    else:
        empate +=1

    ver = False
    while True:
        print("Novo grenal (1-sim 2-nao)")
        repeat = int (input())

        if repeat == 1:
            grenal+=1
            break
        elif repeat == 2:
            ver = True
            break
    if ver:
        break

print (f"{grenal} grenais")
print (f"Inter:{inter}")
print (f"Gremio:{gremio}")
print (f"Empates:{empate}")

if inter > gremio:
    print("Inter venceu mais")
else:
    print ("Gremio venceu mais")