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
print(l)
l = [*l]
b.close()
print(len(l))

running = True
while running:
    generated = []
    numbers = int(input("How many random numbers would you like? (6 for lotto, 7 for lotto Max)"))
    for i in range(numbers):
        generated.append(l[random.randint(0, 48)])
    print(f"your random numbers are {generated}")

