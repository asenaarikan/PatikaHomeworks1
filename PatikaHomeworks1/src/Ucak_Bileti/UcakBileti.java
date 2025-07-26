package Ucak_Bileti;
import java.util.Scanner;

public class UcakBileti {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        while (age<0) {
            System.out.print("Please enter a valid value: ");
            age = scanner.nextInt();
        }
        System.out.print("Please enter the distance value: ");
        double distance = scanner.nextDouble();
        while (distance<0) {
            System.out.print("Please enter a valid value: ");
            distance = scanner.nextDouble();
        }
        System.out.print("Please enter your trip type. For one-way = '1' or for round trip = '2':  ");
        int triptype = scanner.nextInt();
        while (triptype != 1 && triptype != 2) {
            System.out.print("Please enter a valid value: ");
            triptype = scanner.nextInt();
        }
        double total = distance * 0.10;

        if (age<12) {
            if (triptype == 2) {
                System.out.println("The total amount you have to pay : " + (total - ((total - (total * 0.50))* 0.20)));
            } else {
                System.out.println("The total amount you have to pay : " + (total - (total * 0.50)));
            }
        }
        else if ( age > 12 && age < 24) {
            if (triptype == 2) {
                System.out.println("The total amount you have to pay : " + (total - ((total - (total * 0.10))* 0.20)));
            } else {
                System.out.println("The total amount you have to pay : " + (total - (total * 0.10)));
            }
        }
        else if ( age > 65 ) {
            if (triptype == 2) {
                System.out.println("The total amount you have to pay : " + (total - ((total - (total * 0.30)) * 0.20)));
            } else {
                System.out.println("The total amount you have to pay : " + (total - (total * 0.30)));
            }
        }
        else {
            System.out.println("The total amount you have to pay : " + total);
        }
    }
}