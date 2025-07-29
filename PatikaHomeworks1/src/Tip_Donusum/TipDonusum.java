package Tip_Donusum;

import java.util.Scanner;

public class TipDonusum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir tam sayı girin: ");// tam sayı al
        int  number = scanner.nextInt();


        System.out.print("Bir ondalıklı sayı (double) girin: ");// ondalıklı sayı al
        double doubnumber = scanner.nextDouble();


        double numberToDoubnumber = (double) number; // Tam sayıyı double'a dönüştür


        int doubnumberToNum = (int) doubnumber;// Ondalıklı sayıyı int'e dönüştür


        System.out.println("\n--- Dönüştürme Sonuçları ---"); // Sonuçları ekrana yazdır
        System.out.println("Tam sayı (int): " + number);
        System.out.println("Tam sayının double hali: " + numberToDoubnumber);

        System.out.println("Ondalıklı sayı (double): " + doubnumber);
        System.out.println("Ondalıklı sayının int hali: " + doubnumberToNum);
    }
}
