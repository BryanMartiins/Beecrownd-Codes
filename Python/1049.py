priClasse = input()
segClasse = input()
terClasse = input()

if priClasse == "vertebrado":
    if segClasse == "ave":
        if terClasse == "carnivoro":
            print("aguia")
        else:
            print("pomba")    

    else:
        if terClasse == "onivoro":
            print("homem") 

        else:
            if terClasse == "herbivoro":
                print("vaca")

if priClasse == "invertebrado":
    if segClasse == "inseto":
        if terClasse == "hematofago":
            print("pulga")

        else:
            if terClasse == "herbivoro":
                print("lagarta")

    else:
        if terClasse == "hematofago":
            print("sanguessuga")

        else:
            print ("minhoca")
