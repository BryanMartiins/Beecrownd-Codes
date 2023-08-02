salary = float (input())

if salary <= 400.0:
    percentual = 0.15
    commision = salary * percentual

elif salary > 400.0 and salary <= 800.0:
    percentual = 0.12
    commision = salary * percentual

elif salary > 800.0 and salary <= 1200:
    percentual = 0.10
    commision = salary * percentual

elif salary > 1200.0 and salary <= 2000.0:
    percentual = 0.07
    commision = salary * percentual

else:
    percentual = 0.04
    commision = salary * percentual

newSalary = commision + salary

print (f"Novo salario: {newSalary:.2f}")
print (f"Reajuste ganho: {commision:.2f}")
print (f"Em percentual: {percentual*100:.0f} %")
    