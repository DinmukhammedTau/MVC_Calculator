# MVC_Calculator


This project is a basic calculator application built using the MVC pattern (Model-View-Controller). It supports essential arithmetic operations—addition, subtraction, multiplication, and division—and properly handles errors, such as division by zero.

## Features

- **Operations**: Addition (+), Subtraction (-), Multiplication (*), Division (/)
- **Error Handling**: 
  - Displays "Error: Division by zero" message when attempting to divide by zero.
  - Shows an error message for invalid or non-numeric inputs to ensure stable performance.
## Project Structure

- **Model (CalculatorModel): Handles all calculations and core logic for arithmetic operations.
- **View (CalculatorView)**: Manages the graphical user interface (GUI) and user inputs.
- **Controller (CalculatorController): Acts as the intermediary, connecting Model and View, managing button actions, and updating the display with results or error messages.
- **Main (CalculatorApp)**: Initializes Model, View, and Controller components and launches the application.
