package Vucut_Kitle_Indeksi;

import java.util.Scanner;

public class Vucut_Kitle_Indeksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//boy girişi yapılması isteğimi yazdırıyorum
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        // giriş yapılabilmesi için boy değişkeni tanımladım reel sayı
        double boy = scanner.nextDouble();
// kilo girişi yapılmasını istediğimi yazdırıyorum
        System.out.println("Lütfen kilonuzu giriniz: ");
        // giriş yapılabilmesi için kilo değişkeni tanımladım reel sayı
        double kilo = scanner.nextDouble();
        // vücut kitle indeksini bulduran işlemi vki adında değişkene reel sayı olarak atadım

        double vki = kilo / (boy * boy);
        // ekrana yazdırıyorum
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

        scanner.close();
    
   }
}
