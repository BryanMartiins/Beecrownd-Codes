S = 1
i = 1
for k in range (4,40):
    S+= k / (i*2)
    k+=2
    i*=2
print(f"{S:.2f}")