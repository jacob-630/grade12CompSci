import random


con = True

dice = []
final = []
for i in range(5):
    dice.append(random.randint(1, 6))

print(dice)
while(con):
    choice = input("What would you like to do, 1. reroll, 2. lock in a number, 3. finish and tally points: ")
    if choice == "1":
        for i in range(5):
            if i not in final:
                dice[i] = random.randint(1, 5)
                
        print(dice);
    elif choice == "2":
        lockIn = input("What index would you like to lock in? (0 indexed)")
        final.append(lockIn)

    elif choice == "3":
        print("three")
        con = False

