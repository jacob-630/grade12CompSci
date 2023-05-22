import random
import requests


#Import a list of words from the internet
word_site = "https://www.mit.edu/~ecprice/wordlist.10000"
response = requests.get(word_site)
WORDS = response.content.splitlines()

#loop through the list removing and words less than 4 letters
for i in WORDS:
     if len(i) < 4:
          WORDS.remove(i)

#randomly select a word and split it into an array of charcters
word = str(WORDS[random.randint(0, (len(WORDS)-1))])
word = [*word]

#the format of the retrived words needs to be altered to make it appropriate for use
word.pop(0)
word.pop(0)
word.pop()

#test
print(word);

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

#If the player loses turn the correct word into a string and print it out for the user
correctAnswer = "".join(word)
if strikes >= 5:
     print(f"Oh no! you lost, The correct word was {correctAnswer}")