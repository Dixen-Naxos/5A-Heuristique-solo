from src.csv_reader import CSVReader
from src.arg_parser import ArgParser
from src.calculator import Calculator


def main():
    filename, operation = ArgParser.parse_arguments()
    numbers = CSVReader.read_csv(filename)
    calculator: Calculator = Calculator()
    calculator.calculate(numbers, operation)


if __name__ == '__main__':
    main()
