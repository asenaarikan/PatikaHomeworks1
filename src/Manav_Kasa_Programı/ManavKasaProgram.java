package Manav_Kasa_Programı;

import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/**ürünleri tanımlayıp kullanıcıdan kaç kg aldığını girmesini istiyorum
 * sonra her bir ürün için ödeyeceği tutarı belirleyen yeni bir değişken tanımlıyorum
 */
        System.out.println("Kaç kg Armut aldınız?: ");
        double armut = scanner.nextDouble();
        double a = armut * 2.14 ;

        System.out.println("Kaç kg Elma aldınız?: ");
        double elma = scanner.nextDouble();
        double e = elma * 3.67 ;

        System.out.println("Kaç kg Muz aldınız?: ");
        double muz = scanner.nextDouble();
        double m = muz * 0.95 ;

        System.out.println("Kaç kg Patlıcan aldınız?: ");
        double patlican = scanner.nextDouble();
        double p = patlican * 5 ;

// Toplam tutarı hesaplayacak bir değişken tanımlıyorum ve yazdırıyorum
        double t = a + e + m + p;
        System.out.println("Toplam Tutar: " + t + "TL");
        scanner.close();

    }
}
