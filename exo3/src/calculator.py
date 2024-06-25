from src.print_handler import PrintHandler


class Calculator:
    def __init__(self):
        self.result = 0

    def calculate(self, numbers, operation):
        self.result = numbers[0]
        PrintHandler.print_start_number(self.result)
        for i, num in enumerate(numbers[1:], start=1):
            if operation == '+':
                self.result += num
            elif operation == '*':
                self.result *= num
            PrintHandler.print_operation(operation, num, self.result)
        PrintHandler.print_separator()
        PrintHandler.print_results(self.result, operation)
