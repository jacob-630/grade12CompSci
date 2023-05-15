import datetime

#get todays date and put it into a list
dateToday = str(datetime.date.today())
dateToday = dateToday.split("-")
for i in range(len(dateToday)):
    dateToday[i] = int(dateToday[i])

dateAge = round(dateToday[0] * 365.25)
dateAge += (365.25/12 * dateToday[1])
dateAge += dateToday[2]
#collet the users information in the same form of todays date
userDate = []
userDate.append(int(input("What year were you born? ")))
userDate.append(int(input("What month were you born (use number ex. January = 1)? ")))
userDate.append(int(input("What day were you born? ")))

#turn the users birthday into days
userAge = round(userDate[0] * 365.25)
userAge += (365.25/12 * userDate[1])
userAge += userDate[2]

#find the users 21st birthday
user21st = userAge + 7670

#Find how many days to or from the users 21st birthday
tofrom21stArray = []
toFrom21st = user21st - dateAge
tofrom21stArray.append(toFrom21st % 365)
toFrom21st = toFrom21st % 365
tofrom21stArray.append(toFrom21st % (365.25/12))
toFrom21st = round(toFrom21st % (365.25/12))
tofrom21stArray.append(toFrom21st)
print(tofrom21stArray)

