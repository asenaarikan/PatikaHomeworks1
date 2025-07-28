package Reverse_Triangle;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını al
        System.out.print("Üçgenin yüksekliğini giriniz: ");
        int yukseklik = scanner.nextInt();

        // Ters üçgen (sola yaslı) çizimi
        for (int i = 0; i < yukseklik; i++) {
            for (int k = 0; k < (2 * (yukseklik - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Satır atla
        }

        scanner.close();
    }
}
