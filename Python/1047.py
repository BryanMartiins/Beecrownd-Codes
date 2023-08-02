
horaInicial, minutoInicial, horaFinal, minutoFinal = list(map(int,input().split()))


inicio = horaInicial * 60 + minutoInicial
final = horaFinal * 60 + minutoFinal

result = final - inicio


if result <= 0:
    result += 24*60

gameHour = result//60
gameminute = result%60

print (f"O JOGO DUROU {gameHour} HORA(S) E {gameminute} MINUTO(S)")

        
 
