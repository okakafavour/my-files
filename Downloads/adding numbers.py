def get_sum_the_numbers(value:int)->int:
    total = 0
    num = str(value)
    for char in num:
        temp = int(char)
        total += temp
    return total
	
userinput = int(input('enter numbers: '))
add = get_sum_the_numbers(userinput)
print(add)
