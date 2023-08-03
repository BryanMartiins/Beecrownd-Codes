
startDay = (input().split())
startHour, startMinute, startSecond = list(map(int,input().split(":")))

endDay = (input().split())

endHour, endMinute, endSecond = list(map(int,input().split(":")))

seconds = endSecond - startSecond
minutes = endMinute - startMinute
hour = endHour - startHour
day = int (endDay[1]) - int (startDay[1])

if seconds < 0:
    seconds += 60
    minutes -= 1

if minutes < 0:
    minutes += 60
    hour -= 1

if hour < 0:
    hour += 24
    day -= 1
 
print (day," dia(s)")
print (hour," hora(s)")
print (minutes," minuto(s)")
print (seconds," segundo(s)")


