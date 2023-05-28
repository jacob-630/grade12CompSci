import random

#create a file
a = open("rwf.txt", "w+")


for i in range(49):
    r = random.randint(1, 9)
    a.write(f'{r}')

a.close()

#read the file

b = open("rwf.txt", "r")


l = ".".join(b.readlines())

l = [*l]
b.close()


running = True
while running:
    generated = []
    
    numbers = int(input("How many random numbers would you like? (6 for lotto, 7 for lotto Max)"))
    for i in range(numbers):
        generated.append(l[random.randint(0, 9)])
    final = ", ".join(generated)
    print(f"your random numbers are {final}")
    cont = str(input("do you wish to continue? ('yes' or 'no')"))
    if cont == "no":
        print("okay, thanks for using this generator!")
        break
    else:
        continue

