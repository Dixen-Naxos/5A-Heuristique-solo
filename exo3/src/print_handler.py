from src.consts import MAP_CHOICES


class PrintHandler:
    @staticmethod
    def print_start_number(start_number: int) -> None:
        print(f"\t{start_number}")

    @staticmethod
    def print_operation(operation: str, number: int, result: int) -> None:
        print(f"\t{operation}{number} (={result})")

    @staticmethod
    def print_separator():
        print("\t-------")

    @staticmethod
    def print_results(result: int, operation: str) -> None:
        print(f"total = {result} ({MAP_CHOICES.get(operation)})")
