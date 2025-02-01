def get_the_sum_of_even_number(words: str)->int:
	counter = 0
	for char in words:
		if char in "aeiou":
			counter += 1
	return counter

userinput ="python is sweet"
print(get_the_sum_of_even_number(userinput))
