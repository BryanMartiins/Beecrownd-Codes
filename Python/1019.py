totalTime = int (input())

hours = int ((totalTime / 60) // 60)
minutes = int ((totalTime / 60) % 60)
seconds = int (totalTime % 60)

print (f"{hours}:{minutes}:{seconds}")