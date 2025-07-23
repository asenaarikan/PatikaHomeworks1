package Aritmetik_Islemler;
import java.util.Scanner;
public class AritmetikIslemler {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int a = scanner.nextInt();

            System.out.print("İkinci bir sayı giriniz: ");
            int b = scanner.nextInt();

            System.out.print("Üçüncü bir sayı giriniz: ");
            int c = scanner.nextInt();

            double sonuc = a + b * c - b;
            System.out.print("Result: " + sonuc);

    }
}
