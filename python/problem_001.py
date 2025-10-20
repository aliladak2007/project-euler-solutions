# problem_001.py

def sum_of_multiples(limit):
    """Return the sum of all numbers below 'limit' that are multiples of 3 or 5."""
    total = 0
    for i in range(1, limit):
        if i % 3 == 0 or i % 5 == 0:
            total += i
    return total


def main():
    result = sum_of_multiples(1000)
    print(f"Sum of multiples of 3 or 5 below 1000: {result}")


if __name__ == "__main__":
    main()
