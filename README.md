# ⚠️ 1.2-Exceptions  
A complete set of exercises focused on exception handling in Java.  
This project demonstrates how to work with built-in and custom exceptions to build robust and user-friendly applications.

## 📄 Description - Exercise Statement

This repository contains the full solution for **Sprint 1 - Exceptions** of the Java programming track.  
The sprint is divided into three levels, each focusing on more advanced exception management techniques:

### 💥 Level 1  
- Implements a `Product` and `Sale` class to simulate a sales system.  
- Introduces a custom exception `SaleEmptyException` that is thrown if an attempt is made to calculate a sale with no products.  
- Demonstrates the use and handling of built-in exceptions like `IndexOutOfBoundsException`.

### 🎯 Level 2  
- Provides a utility class `Ticket` with static methods to safely read user input from the console using `Scanner`.  
- Implements error handling with `InputMismatchException` and custom exceptions for invalid character, string, or yes/no input.  
- Ensures the program continuously asks for input until valid data is entered.

### 🎟️ Level 3  
- Simulates a movie theater seat reservation system.  
- Models domain classes such as `Seat`, `Cinema`, `ManageSeats`, and `ManageCinema`.  
- Uses custom exceptions like `IncorrectPersonNameException`, `IncorrectRowException`, `IncorrectSittingException`, `OccupiedSeatException`, and `OpenSeatException` to enforce data integrity.  
- Includes a complete interactive menu to manage reservations and cancellations.

## 💻 Technologies Used
- Java (SDK 23)
- IntelliJ IDEA (used for development)
- No external dependencies or frameworks

## 📋 Requirements
Before running this project, make sure you have:

- Java SDK **17+** or higher (SDK 23 was used during development)
- IntelliJ IDEA or Eclipse (recommended for easier navigation)
- Git (optional, for cloning the repository)

## 🛠️ Installation

To run this project, you **must first clone the repository locally**. Otherwise, you won't be able to open it correctly in IntelliJ IDEA.
To get a local copy of the project:

```bash
# Clone this repository
https://github.com/maarselo/1.2-Exceptions.git

# Navigate into the project directory
cd 1.2-Exceptions/
```

### 📥 Cloning and Opening in IntelliJ IDEA

1. Open **IntelliJ IDEA**.
2. On the welcome screen, click **"Clone Repository"** (Get from Version Control).
3. Paste the following URL into the **URL** field:
```bash
git clone https://github.com/maarselo/1.1-InheritancePolymorphism.git
```
4. Choose the folder where the project should be saved.
5. Click **Clone**.

 if you already have it cloned, click on `Open` and select the local copy to open it. 

## ▶️ Running the Project

To run the program:

- Open the class that contains the `main()` method.
- Click the green **Run** button in IntelliJ IDEA, or press **Shift + F10**.
- If IntelliJ prompts you to sync or import dependencies, confirm the action.

Each exercise (level) can be executed independently by running its corresponding main class.  
For example, Level 3 launches an interactive menu that simulates a movie theater reservation system.

## 🌐 Deployment

This project is intended to run in a **local development environment** only.  
No production deployment configuration has been defined.

In the future, it could be extended into a GUI or web-based application for a better user experience.

## 🤝 Contributions

Contributions are welcome! If you’d like to collaborate:

1. Fork this repository.
2. Create a new branch:  
 `git checkout -b feature/YourFeatureName`
3. Make your changes and commit them:  
 `git commit -m "Add: Your meaningful commit message"`
4. Push your branch to your fork:  
 `git push origin feature/YourFeatureName`
5. Open a pull request with a clear description of your changes.

Thanks for your interest and support! 🚀
