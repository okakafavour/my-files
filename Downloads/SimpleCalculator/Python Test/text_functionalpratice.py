import unittest
import functionalpratice 

class TestCubeFunction(unittest.TestCase):

    def test_that_cube_function_exists(self):
            functionalpratice.get_cube(3)
            
    def test_that_cube_function_return_correct_value(self):
            actual = functionalpratice.get_cube(3)
            result = 27
            self.assertEqual(actual, result)
            actual = functionalpratice.get_cube(5)
            result = 125
            self.assertEqual(actual, result)
            
    def test_that_cube_function_return_negative_value_with_negative_parameter(self):
            actual = functionalpratice.get_cube(-3)
            result = -27
            self.assertEqual(actual, result)
            
    def test_that_cube_function_return_invalid_data_with_invalid_input(self):
            actual = functionalpratice.get_cube('a')
            result = 'invalid data'
            self.assertEqual(actual, result)
       
    def test_that_cube_function_return_correct_value_with_decimal_value(self):
            actual = functionalpratice.get_cube(3.25)
            result = 34.328
            self.assertEqual(actual, result)
            
            

            
            