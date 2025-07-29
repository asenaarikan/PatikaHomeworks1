📄 README.md (English)

Password Validation Program (Java)

This Java program checks whether a user-entered password is valid based on specific rules. If the password violates any rule, the program informs the user about each specific error and asks for a new password until all rules are satisfied.

✅ Password Rules
Must be at least 8 characters long

Must not contain any space characters

The first character must be an uppercase letter

The last character must be a ?

🔁 Program Flow

The user is prompted to enter a password.

The program checks the password against all four rules.

If any rule is violated:

The program displays which rules were broken.

The user is prompted to enter a new password.

If all rules are satisfied:

It prints "Valid Password" and ends.

💻 Sample Output

Enter password: merhaba?

ERROR: Password must start with an uppercase letter.

Please enter your password again.


Enter password: Merhaba

ERROR: Password must end with '?'

Please enter your password again.



Enter password: Merhaba?

Valid Password



🛠️ Technologies Used

Java 8+

Scanner class for user input

Character class for character operations

📁 File Info

SifreKontrol.java 

→ Main Java source file