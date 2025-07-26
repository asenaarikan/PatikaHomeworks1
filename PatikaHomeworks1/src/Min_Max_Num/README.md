# MinMaxNum Java Program
# Description
* The MinMaxNum program prompts the user to enter a specific number of integers and determines the minimum and maximum values among them. The user specifies how many numbers they want to compare.

# Features
* Prompts the user to enter how many numbers they want to compare
* Reads the numbers and finds the smallest and largest
* Uses the ternary operator for concise comparison 
* Basic input validation (ensures a positive count)

# Technologies Used
* Java 17 (or any Java version 8 and above)
* Scanner class for user input

# How to Run
* Add the file (MinMaxNum.java) to a Java project or directory. 
* Compile and run it via terminal/command prompt:
* javac MinMaxNum.java  
* java MinMaxNum
* Follow the prompts and enter the numbers as requested

# Sample Output
* How many numbers do you want to compare?
* 5
* Enter number 1= 12
* Enter number 2= 4
* Enter number 3= 19
* Enter number 4= -3
* Enter number 5= 8
* Biggest num is : 19
* Smallest num is : -3

# ⚠️ Notes
* The number of inputs must be positive. Otherwise, the program will display a warning.

* Only integers are supported (not floating-point numbers).

* It's recommended to call scanner.close() at the end to properly close the input stream.

# 📁 File Structure

Min_Max_Num/

└── MinMaxNum.java 