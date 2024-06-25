import argparse

from src.consts import MAP_CHOICES


class ArgParser:
    @staticmethod
    def parse_arguments():
        parser = argparse.ArgumentParser(description='Calculate operations on a CSV.')
        parser.add_argument('filename', type=str, help='The CSV file to operate on')
        parser.add_argument('operation', type=str, choices=MAP_CHOICES.keys(), help='The operation to perform (+ or *)')
        args = parser.parse_args()
        return args.filename, args.operation
