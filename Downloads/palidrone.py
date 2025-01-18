def get_palindrone_numbers(value:str)->int:
    count = 0 
    num = str(value)
    for temp in num:
        char = int(temp)
        if char % 10 and char / 10: 
            count + 1
            if char == char:
              count + 1  
    return True        
            
userinput = int(input('Enter seven numbers: '))
add =  get_palindrone_numbers(userinput)
print(add)