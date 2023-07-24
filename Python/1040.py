
medFinal = 0
nota1,nota2,nota3,nota4 = list(map(float,input().split()))

medPonderada = (nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.4 + nota4 * 0.1)

if medPonderada >= 7.0 and medPonderada <= 10.0:
    print(f"Media: {medPonderada:.1f}")
    print("Aluno aprovado.")


elif medPonderada >= 5.0 and medPonderada <= 6.9:
    print(f"Media: {medPonderada:.1f}")
    print ("Aluno em exame.")
    exame = float(input())
    print(f"Nota do exame: {exame:.1f}")

    medFinal = (exame + medPonderada)/2
    if medFinal >= 5.0 and medFinal <= 10.0:
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")     

    print ("Media final:",medFinal,)    

else:
    print (f"Media: {medPonderada-0.1:.1f}")
    print("Aluno reprovado.")    