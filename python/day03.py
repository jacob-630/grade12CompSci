import random

array = []
for i in range(5):
    array.append(random.randint(1, 6))
print(array)
while True:
    end = input("1. to reroll, 2. to lock in a number, 3 to finish and tally score? ")
    if end == 1:
        for i in array:
            i = random.randint(1, 6)
    elif end == 2:
        og = int(input("what index would you like to lock in (0 indexed)? "))
        new = int(input("what would you like to change these numbers to? "))
        for i in range(len(array)):
            if array[i] == og:
                array[i] = new
                totalChng += 1
    else:
        elementChng = int(input("Which element would you like to change? (note: arrays are zero indexed) "))
        if 0 > elementChng or elementChng > length:
            print("This index does not exist in this array.")
            continue;
        newEl = int(input("what number (between 1 and 6 inclusive) do you wish to change it to? "))
        if 1 > newEl or newEl > 6:
            print("The number entered is not between 1 and 6.")
            continue
        array[elementChng] = newEl; 
        totalChng += 1;
    print(array);
print("Your score is "+ str(sum(array)) +" out of " + str(length * 6) + " thats " + str(int((sum(array) / (length * 6)) * 100)) + "%, "+
      "you also changed a total of " + str(totalChng) + " numbers.")   


