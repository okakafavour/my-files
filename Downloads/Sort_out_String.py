def get_sum_of_even_number(values:str)->int:
    total = 0
    for char in values:
        if char.isnumeric():
            temp = int(char)
        if temp % 2 == 0:
                        total += temp
                    
                    
    return total

userinput = input('Enter anything: ')

filter = get_sum_of_even_number(userinput)

print(filter)    
