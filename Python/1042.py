a , b, c = list (map(int,input().split()))

if a > b and a > c:
    if b > c:
            print(c)
            print(b)
            print(a)
    else:
          print (b)
          print (c)
          print (a)
elif b > a and b > c:
      
    if c > a:
            print (a)
            print (c)
            print (b)

    else:  
        print (c)
        print (a)
        print (b)
else:
    if a > b:
        print (b)
        print (a)
        print (c)
    else:
         print (a)
         print (b)
         print (c)

print ()

print (a)
print (b)
print (c)
                     
                               

