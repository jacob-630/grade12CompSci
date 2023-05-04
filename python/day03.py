import random


def addDice(dice):
    diceSum = 0
    for i in dice:
        diceSum += i
    
    return diceSum


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
               dice[i] = random.randint(1, 6);
       print(dice)
        
           
    
    elif choice == "2":
        lockIn = int(input("What index would you like to lock in? (0 indexed: )"))
        final.append(lockIn)

    elif choice == "3":
        print(addDice(dice))
        con = False






def tallyPoints(dice):
    score = 0
    dice = dice.sort()
    #Check for Yahtzee
    if(dice[0] == dice[4]):
        score += 50
    #Check for large straight
    elif ((dice[0] + dice[4] == 6) and (dice[1] + dice [3] == 6) and (dice[2] * 2 == 6)):
        score += 40
    elif((dice[0] + dice[4] == 8) and (dice[1] + dice[3] == 8) and (dice[2] * 2 == 6)):
        score += 40
    #Check for Small straight
    elif((dice[0] + dice [3] == 5) and (dice[1] + dice[2] == 5)):
        score += 30
    elif((dice[1] + dice [4] == 9) and (dice[2] + dice[3] == 9)):
        score += 30 
    #Check for four of a kind
    elif(dice[0] == dice[3] or dice[1] == dice[4]):
        score += 25
    #Check for three of a kind
    elif((dice[2] == dice[4]) or (dice[1] == dice[3]) or (dice[0] == dice[2])):
        score += 20