class CSVReader:
    @staticmethod
    def read_csv(filename):
        with open(filename, 'r') as file:
            lines = file.readlines()
            numbers = [int(line.strip()) for line in lines]
        return numbers
