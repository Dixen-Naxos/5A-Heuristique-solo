import pytest
from unittest.mock import MagicMock
from src.calculator import Calculator
from src.print_handler import PrintHandler


@pytest.fixture
def mock_print_handler():
    """Fixture to mock PrintHandler."""
    mock = MagicMock()
    setattr(PrintHandler, "print_start_number", mock)
    setattr(PrintHandler, "print_operation", mock)
    setattr(PrintHandler, "print_separator", mock)
    setattr(PrintHandler, "print_results", mock)
    return mock


def test_calculate_addition(mock_print_handler):
    """Test calculate method with addition operation."""
    calculator = Calculator()
    numbers = [1, 2, 3]
    operation = '+'
    calculator.calculate(numbers, operation)
    assert calculator.result == 6
    mock_print_handler.assert_any_call(1)
    mock_print_handler.assert_any_call('+', 2, 3)
    mock_print_handler.assert_any_call('+', 3, 6)
    mock_print_handler.assert_any_call()
    mock_print_handler.assert_called_with(6, '+')


def test_calculate_multiplication(mock_print_handler):
    """Test calculate method with multiplication operation."""
    calculator = Calculator()
    numbers = [1, 2, 3]
    operation = '*'
    calculator.calculate(numbers, operation)
    assert calculator.result == 6
    mock_print_handler.assert_any_call(1)
    mock_print_handler.assert_any_call('*', 2, 2)
    mock_print_handler.assert_any_call('*', 3, 6)
    mock_print_handler.assert_any_call()
    mock_print_handler.assert_called_with(6, '*')
