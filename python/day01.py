import math

def myMaths(a, b):
    sum = "The sum of "+ str(a) + " and " + str(b) + " is "+ str(a+b);
    difference = ". The difference of "+ str(a) + " and " + str(b) + " is "+ str(a-b);
    product = ". The product of "+ str(a) + " and " + str(b) + " is "+ str(a*b);
    quotient = ". The quotient of "+ str(a) + " and " + str(b) + " is "+ str(a/b);
    module = ". The module of "+ str(a) + " and " + str(b) + " is "+ str(a%b);
    power = ". The result of "+ str(a) + " to the power of " + str(b) + " is "+ str(math.pow(a, b));
    pythagorean = ". The result of the pythagorean therom with "+ str(a) + " and " + str(b) + " is "+ str(math.sqrt((math.pow(a, 2) + math.pow(b, 2))));
    print(sum + difference + product + quotient + module + power + pythagorean);


name = input("What is your name? ")
print("hello, "+name);
num1 = float(input("What is your first number? "));
num2 = float(input("What is your second number? "));
myMaths(num1, num2);



