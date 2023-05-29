import random

#create a file
a = open("rwf.txt", "w+")

#write 49 random numbers in the file
for i in range(49):
    r = random.randint(1, 9)
    a.write(f'{r}')

a.close()

#read the file
b = open("rwf.txt", "r")
l = ".".join(b.readlines())
#make an array with all the numbers from the file
l = [*l]
b.close()

#create a loop to serve as the menu and continusly loop through it
running = True
while running:
    generated = []
    
    numbers = int(input("How many random numbers would you like? (6 for lotto, 7 for lotto Max)"))

    #add to a list the specified number of random numbers
    for i in range(numbers):
        generated.append(l[random.randint(0, 9)])
    final = ", ".join(generated)
    
    #print out the random numbers before asking the user if they wish to continue
    print(f"your random numbers are {final}")

    #either exit the while loop or continue looping through it based off the users input
    cont = str(input("do you wish to continue? ('yes' or 'no')"))
    if cont == "no":
        print("okay, thanks for using this generator!")
        break
    else:
        continue