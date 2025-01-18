import math

number_of_people = 0   
number_of_boxes = 0
slice_remaining = 0
price_of_boxes = 0

number_of_people = int(input('Numbers of people that want to eat the pizza: '))
while number_of_people < 1:
        print('Invalid input.Enter a positive number')
        number_of_people = int(input('Numbers of people that want to eat the pizza: '))
   
    
print("""
    
  <<< CHOOSE THE TYPE OF PIZZA FROM THE MENU BELOW >>>
    
    S/N         PIZZA TYPE    SLICES    AMOUNT
      1.      Sapa size        4        2,500
      2.      Small money      6        2,900
      3.      Big boys         8        4,000
      4.      Odogu            12       5,200
      
      """)
   
    
pizza_type = int(input('Enter the number of the type of pizza: '))
while pizza_type < 1:
        print('Invalid input.Enter a positive number')
        pizza_type = int(input('Enter the number of the type of pizza: '))
        
match(pizza_type):
            case 1: 
                    number_of_boxes = math.ceil(number_of_people / 4)
                    print('The number of boxes:', number_of_boxes)
                    slice_remaining = (number_of_boxes * 4) - number_of_people
                    print('The number of remaining slice left:', slice_remaining)
                    price_of_boxes = number_of_boxes * 2500
                    print('The price of boxes:', price_of_boxes)
               
            case 2: 
                number_of_boxes = math.ceil(number_of_people / 6)
                print('The number of boxes:', number_of_boxes)
                slice_remaining = (number_of_boxes * 6) - number_of_people
                print('The number of remaining slice left:', slice_remaining)
                price_of_boxes = number_of_boxes * 2900  
                print('The price of boxes:', price_of_boxes)
                
            case 3:
                number_of_boxes = math.ceil(number_of_people / 8)
                print('The number of boxes:', number_of_boxes)
                slice_remaining = (number_of_boxes * 8) - number_of_people
                print('The number of remaining slice left:', slice_remaining)
                price_of_boxes = number_of_boxes * 4000
                print('The price of boxes:', price_of_boxes)
                
            case 4:
                number_of_boxes = math.ceil(number_of_people / 12)
                print('The number of boxes:', number_of_boxes)
                slice_remaining = (number_of_boxes / 12) - number_of_people
                print('The number of remaining slice left:', slice_remaining)
                price_of_boxes = number_of_boxes * 5200
                print('The price of boxes:', price_of_boxes)
                
               
                