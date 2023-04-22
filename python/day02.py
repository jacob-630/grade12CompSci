import math
import random


length = int(input("How big of an array would you like? "))
array = []
for i in range(length):
    array.append(random.randint(1, 6))

print(array)

cont = True
while cont:
    end = input("would you like to change an element? ")
    if end == "no":
        cont = False
        break
    elementChng = int(input("Which element would you like to change? (note: arrays are zero indexed) "))
    if 0 > elementChng > length:
        print("This index does not exist in this array")
    newEl = int(input("what number (between 1 and 6 inclusive) do you wish to change it to? "))
    if 1 > newEl > 6:
        print("The number entered is not between 1 and 6")
        continue
    array[elementChng] = newEl;
    print(array);
    