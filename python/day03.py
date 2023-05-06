import random


def addDice(dice):
    diceSum = 0
    for i in dice:
        diceSum += i
    
    return diceSum


            

            
def tallyPoints(dice):
    score = 0
    dice.sort()


    #Check for Yahtzee
    if(dice[0] == dice[4]):
        print("You have a Yahtzee")
        score += 50

    #Check for straights both long and small
    elif(dice[3] - dice[2] != 2) and (dice[2] - dice[1] != 2):
        sStraight = 0
        for i in range(4):
            if(dice[i+1]-dice[i] == 1):
                sStraight += 1
        if sStraight == 3:
            print("You have a small straight")
            score += 30;
        elif sStraight == 4:
            print("You have a large straight")
            score += 40
    

    #Check for four of a kind
    elif(dice[0] == dice[3] or dice[1] == dice[4]):
        print("You have four of a kind")
        score += 25


    #Check for three of a kind
    elif((dice[2] == dice[4]) or (dice[1] == dice[3]) or (dice[0] == dice[2])):
        print("You have three of a kind")
        score += 20
    return score

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
        print("your score is: " + str(tallyPoints([6, 2, 3, 4, 5]) + addDice(dice)))
        con = False






