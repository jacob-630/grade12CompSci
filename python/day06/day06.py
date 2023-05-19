import random

from english_words import get_english_words_set
web2lowerset = get_english_words_set(['web2'], lower=True)

print(web2lowerset)
#array of potential words
words = ["bedroom", "jacket", "paper", "calculator", "pencil", "monitor", "charger", "cellphone", "container", "television"]

#randomly select a word and split it into an array of charcters
word = words[random.randint(0, 9)]
word = [*word]


#test
#print(word);

#make an array of '_' to represent the unknown charcters
guesses = []
for i in range(len(word)):
    guesses.append("_")

#initalize the strike counter
strikes = 0;

#run through and get the players guesses, check if they match, if not add strikes, if they do fill in charcters
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

