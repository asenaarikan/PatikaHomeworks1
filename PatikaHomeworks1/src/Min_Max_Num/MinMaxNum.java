package Min_Max_Num;

import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

// Ask user how many numbers they want to compare
        System.out.println("How many numbers do you want to compare?");
        int n = scanner.nextInt();

        // It must be positive number
        if ( n <= 0) {
            System.out.println("Please enter positive number");
        } else {
            System.out.print("Enter number 1= ");
                    int num = scanner.nextInt();

            int min = num;
            int max = num;

            for(int i=2 ; i<=n ; i++) {
                System.out.println("Enter number " + i + "=");
                num = scanner.nextInt();

                min = (num < min) ? num : min;
                max = (num > max) ? num : max;
            }
            System.out.println("Biggest num is : "+ max);
                    System.out.println("Smallest num is : "+ min);
        }

            }

        }

