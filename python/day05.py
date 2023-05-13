import datetime

dateToday = str(datetime.date.today())

dateToday = dateToday.split("-")

for i in range(len(dateToday)):
    dateToday[i] = int(dateToday[i])

userDate = []

userDate.append(int(input("What year were you born? ")))
userDate.append(int(input("What month were you born (use number ex. January = 1)? ")))
userDate.append(int(input("What day were you born? ")))

print(userDate)