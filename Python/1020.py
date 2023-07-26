tempoDias = int (input())

ano = tempoDias // 365
mes = tempoDias % 365 // 30
dias = tempoDias % 365 % 30


print (ano,"ano(s)")
print (mes,"mes(es)")
print (dias,"dia(s)")