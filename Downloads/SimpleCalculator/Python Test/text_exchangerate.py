import unittest;
import exchangerate

class TestExchangeRate(unittest.TestCase):

    def test_that_exchangerate_function_exist(self):
            exchangerate.get_amount(10)

    def test_that_amount_function_that_takes_a_dollar_and_return_equivalent_value_in_naira(self):
            actual = exchangerate.get_amount(10)
            result = 15500
            self.assertEqual(actual, result)
            