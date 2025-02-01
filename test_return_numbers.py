import unittest
import return_numbers

class Test_return_numbers(unittest.TestCase):

	def test_that_the_return_numbers_exist(self):
		numbers =[34, 2, 4, 55, 75, 90, 85, 101]
		return_number.get_return_number(numbers)



	def test_that_the_return_numbers_exist2(self):
		numbers =[34, 2, 4, 55, 75, 90, 85, 101]
		result = return_number.get_return_number(numbers)
		expected = [75, 85, 90]
		self.assertEqual(result, expected)









if __name__=="__main":
	unittest.main()