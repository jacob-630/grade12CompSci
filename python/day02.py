import random
length = int(input("How big of an array would you like? "))
array = []
for i in range(length):
    array.append(random.randint(1, 6))
print(array)
cont = True
totalChng = 0
while cont:
    end = input("would you like to change an element, you may also 'replace all' of an element? ").lower()
    if end == "no":
        cont = False
        break
    elif end == "replace all":
        og = int(input("what number would you like to replace all of? "))
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
        array[elementChng] = newEl
        totalChng += 1;
    print(array);
print("Your score is "+ str(sum(array)) +" out of " + str(length * 6) + " thats " + str(int((sum(array) / (length * 6)) * 100)) + "%, "+
      "you also changed a total of " + str(totalChng) + " numbers.")   


