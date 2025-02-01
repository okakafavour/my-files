list = [2,3,7,8,12,27,10]
def get_sum_of_even_number(values:list)->int:
	total = 0;
	for char in values:
		if char % 2 == 0:
			total += char
	return total
print(get_sum_of_even_number(list))