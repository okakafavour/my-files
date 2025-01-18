def find_the_common_number(value, search)->int:
    counter = 0
    char = str(value)
    for tab in char:
        if search == int(tab):
            counter + 1 
    return counter				
				
				
				
				
userinput = int(input('Enter numbers: '))
search = int(input('Enter the number you want to search for: '))

filter = find_the_common_number(userinput, search)
print(userinput)