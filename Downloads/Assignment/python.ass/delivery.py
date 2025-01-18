print("""
   Collection Rate      Amount Per Parcel    Base Pay
  
   Less than 50%             160               5,000
     50 - 59%                200               5,000
     60 - 69%                250               5,000
      >= 70%                 500               5,000
""")
   
delivery = int(input('Enter the successful delivery the rider had for the day: '))
result = 0
while delivery < 1:
	print('Invalid input.Enter valid input: ')
	delivery = int(input('Enter the successful delivery the rider had for the day: '))
	
if (delivery < 50):
	result = int(delivery * 160 + 5000) 
elif (delivery <= 59):
	result = int(delivery * 200 + 5000)
elif (delivery <= 69):
	result = int(delivery * 250 + 5000)
elif (delivery >= 70):
	result = int(delivery * 500 + 5000)
print(result)