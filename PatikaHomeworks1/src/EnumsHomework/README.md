# 🗓️ Java Enum Example: Day Working Hours

## 📘 Overview
This project demonstrates how to use **Enums** in Java to represent the days of the week along with their respective working hours.  
Each day is represented as a constant in an `enum` class named `Day`, and each constant stores specific working hour information.

---

## 🚀 Features
- `Day` enum defines seven constants for each day of the week.
- Each constant stores its **working hours** as a string.
- Includes a **constructor** and a **getter method** within the enum.
- Uses `Scanner` to get user input and displays the selected day’s working hours.
- Implements **error handling** with `try-catch` for invalid inputs.

---

## 🧩 Enum Class: `Day.java`


public enum Day {
    SUNDAY("Holiday"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("10:00 - 14:00");

    private final String workingHours;

    Day(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }
}

# Explanation:

private final String workingHours; → stores working hour info for each day.

Day(String workingHours) → constructor assigns working hour value to each enum constant.

getWorkingHours() → returns the working hours of a specific day.

# 💻 Main Class: Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);

        System.out.println("Enter a day of the week (e.g., MONDAY):");
        String userInput = input.nextLine().trim().toUpperCase();

        try {
            Day selectedDay = Day.valueOf(userInput);
            System.out.println(selectedDay + " working hours: " + selectedDay.getWorkingHours());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day. Please enter a valid day name (e.g., MONDAY).");
        }
    }
}


# Explanation:

nextLine() reads user input as a full line.

trim() removes unnecessary spaces.

toUpperCase() converts lowercase letters to uppercase for matching enum names.

Day.valueOf(userInput) converts user input into the corresponding enum constant.

try-catch prevents the program from crashing if an invalid day is entered.

# 🧠 Example Output
✅ Valid Input
Enter a day of the week (e.g., MONDAY):
monday
MONDAY working hours: 09:00 - 17:00

❌ Invalid Input
Enter a day of the week (e.g., MONDAY):
abcday
Invalid day. Please enter a valid day name (e.g., MONDAY).

# 🧱 Key Concepts Covered

Enums in Java

Enum constructors and fields

Getter methods

User input handling (Scanner)

Error handling with try-catch

# 📂 Project Structure

PatikaHomeworks1 / src / EnumsHomework

 ├── Day.java

 └── Main.java

# 🧑‍💻 Author

Developed by Asena Arıkan
Educational project for demonstrating Java Enum usage.

# 🏁 License

This project is created for learning purposes and can be freely used for educational or personal projects.