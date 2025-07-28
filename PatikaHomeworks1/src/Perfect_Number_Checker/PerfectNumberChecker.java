package Perfect_Number_Checker;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main (String[] args) {
        Scanner scanner= new Scanner(System.in);

        while (true) {
            System.out.print("\nBir sayı giriniz (çıkmak için 0 yazın): ");
            int number = scanner.nextInt();

            // Çıkış kontrolü
            if (number == 0) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            // Negatif sayı kontrolü
            if (number < 0) {
                System.out.println("Lütfen pozitif bir sayı giriniz.");
                continue;
            }

            int sum = 0;

            // Bölenlerin toplamı hesaplanıyor
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            // Mükemmel sayı kontrolü
            if (sum == number) {
                System.out.println(number + " bir mükemmel sayıdır.");
            } else {
                System.out.println(number + " bir mükemmel sayı değildir.");
            }
        }

        scanner.close();

    }
}
