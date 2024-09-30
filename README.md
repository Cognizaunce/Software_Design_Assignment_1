# Software_Design_Assignment_1
Julian Olano Medina - Software Design and Architecture Assignment 1, Winter 2024.
# Grocery Store Product Factory
This project implements a design pattern assignment using both the Abstract Factory Pattern and the Factory Method Pattern. The goal is to create different grocery products (such as Bananas and Apples), set their prices after creation by reading from a data file, and demonstrate the functionality with a test driver.

![Updated UML Diagram](docs/New%20UML%20Diagram.png)


# Project Structure
This is how my project is structured:

### **1. `/`**
The root of the project has all the relevent assignment files

- **`GroceryProductFactory.java`**: 
  - Defines the abstract factory interface that creates products and sets their prices.
  
- **`BananaFactory.java`**:
  - Implements the `GroceryProductFactory` interface to create `Banana` and set the price based on the data file.
  - Also includes the **`Banana`** Class
    - Concrete class that represents the Banana product, extending the `GroceryProduct` class.
  
- **`AppleFactory.java`**:
  - Implements the `GroceryProductFactory` interface to create `Apple` and set the price based on the data file.
  - Also includes the **`Apple`** Class
    - Concrete class that represents the Apple product, extending the `GroceryProduct` class.

- **`GroceryProduct.java`**:
  - Abstract base class for all products, providing the blueprint for setting and getting product prices.

- **`TestDriver.java`**:
  - Main test class that demonstrates the functionality of the factory pattern. It creates instances of `Bananas` and `Apples` using the factories and sets the price from the data file.

### **2. `docs/`**
This folder contains the images and graphics used for this readme file

# Test Methods

## testDriver.java
Test driver to demonstrate that the code works
using 2 examples of a product such as Bananas and Apples.
### Sample Output

![Sample Output](docs/Proof%20Code%20Works.png)
