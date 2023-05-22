import datetime


#get todays date and put it into a list
dateToday = datetime.date.today()


#collet the users information in the same form of todays date

userYear = (int(input("What year were you born? ")))
userMonth = (int(input("What month were you born (use number ex. January = 1)? ")))
userDay = (int(input("What day were you born? ")))

userDate = datetime.date(userYear, userMonth, userDay)

#find the users 21st birthday
turn21 = datetime.date(userYear + 21, userMonth, userDay)

#Find how many days to or from the users 21st birthday

fromLastBday = dateToday - datetime.date(2022, userMonth, userDay)
toNextBday = datetime.date(2023, userMonth, userDay) - dateToday
tofrom21st = turn21 - dateToday
print("It has been " + str(fromLastBday) + " days since your last birthday")
print("It is  " + str(toNextBday) + " days until your next birthday")
print("It is " + str(tofrom21st) + " days until your 21st birthday!")




