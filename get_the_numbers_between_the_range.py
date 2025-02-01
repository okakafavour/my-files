def get_the_numbers_between_the_range(value:list)->list:

	return[number for number in value if number >= 75 and number <= 100 ]

value =[34, 2, 4, 55, 75, 90, 85, 101]
print(get_the_numbers_between_the_range(value))


