name = input("What is your first and last name? ").lower()
baseS = "why hello " + name + " i hope that this message finds you well, this message is over 100 charcters long, it will be the string your letter is searched for in."
print(baseS)

letter = input("what letter are you searching for? ")

positions = []
for i in range(len(baseS)):
    if baseS[i] == letter:
        positions.append(str(i))

pos = ", ".join(positions)
print("Your letter appears in position(s) " + str(pos) )
appearences = baseS.count(letter)
print("It appears a total of " + str(appearences) + " times")