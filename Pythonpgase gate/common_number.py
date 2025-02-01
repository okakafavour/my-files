def find_the_common_number(value:list)->list:
	counter = 0
	char = str(value)
	for tab in char:
		if search == tab:
			counter + 1
	return counter

userinput = ([1,2,3],[3,4,5])
search = 3
filter = find_the_common_number(userinput)
print(filter)