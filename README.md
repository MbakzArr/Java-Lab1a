# Bank Account System

This project contains a Python implementation of a bank account system along with its corresponding Java implementation. The Python version consists of two files: `bank_account.py` defining the `BankAccount` class and `main.py` containing the main function to create bank account objects and perform operations on them. The Java version also consists of two files: `BankAccount.java` defining the `BankAccount` class and `Main.java` containing the main method.

## Python Implementation

### `bank_account.py`

This file contains the definition of the `BankAccount` class with properties and methods to manage bank accounts.

#### Class: `BankAccount`

- `__init__(self, balance_cdn, account_number, member_last_name)`: Constructor to initialize a bank account object with a balance, account number, and member's last name.
- `withdraw(self, amount_cdn)`: Method to withdraw cash from the account.
- `deposit(self, amount_cdn)`: Method to deposit cash into the account.
- `transfer(self, amount_cdn, recipient_account)`: Method to transfer cash to another account.

### `main.py`

This file contains the main function to create bank account objects and perform operations on them.

#### Function: `main()`

- Creates two `BankAccount` objects.
- Performs operations like withdrawing, depositing, and transferring cash between accounts.

## Java Implementation

### `BankAccount.java`

This file contains the Java implementation of the `BankAccount` class with similar properties and methods as the Python version.

#### Class: `BankAccount`

- Constructor to initialize a bank account object with a balance, account number, and member's last name.
- Methods to withdraw, deposit, and transfer cash.

### `Main.java`

This file contains the main method to create bank account objects and perform operations on them.

#### Main Method

- Creates two `BankAccount` objects.
- Performs operations like withdrawing, depositing, and transferring cash between accounts.

## How to Run

To run the Python version, execute the `main.py` file using Python. To run the Java version, compile the `.java` files and execute the `Main` class.

```bash
# Python
python main.py

# Java
javac BankAccount.java Main.java
java Main
```

## Output

The expected output of running the main function in both versions is shown below the code in the `main.py` file.

```
100.0
abc123
95.0
---
500.0
woods
523.0
---
45.0
573.0
