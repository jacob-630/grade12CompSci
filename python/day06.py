import random

words = ["laptop", "jacket", "paper", "calculator", "pencil", "monitor", "charger", "cellphone", "container", "television"]

word = words[random.randint(0, 9)]
word = [*word]
guesses = []
print(word);
for i in range(len(word)):
    guesses.append("_")

strikes = 0;
while strikes < 5:
    guess = str(input("what is your guess? ")).lower()
    if guess not in word:
            strikes += 1
            print(strikes)
    for i in range(len(word)):
        if word[i] == guess:
            guesses[i] = guess
    if "_" not in guesses:
         print("Congratulations you won!")
         break
    print(guesses)

