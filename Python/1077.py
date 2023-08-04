N = int (input ())
media = 0
for i in range (0,N):
    n1,n2,n3 = list (map(float,input().split()))

    media = (n1*0.2 + n2 *0.3 + n3 * 0.5)

    print(f"{media:.1f}")