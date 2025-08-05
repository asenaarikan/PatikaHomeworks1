package Asal_Sayi_Bulma;

import java.util.Scanner;

public class AsalSayiBulma {
    public static void main ( String[] args) {

        // Kullanıcıdan sayı alınır
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number=scanner.nextInt();


        boolean isPrime=true ;

        // Sayının 2den başlayarak kendinden küçük sayılara bölünüp bölünemediği kontrol edilir.
        for (int i=2 ; i< number ; i++) {
            if (number%i==0)  {
                isPrime=false;
            }
        }

        // Koşulu sağlayanlar asal değil ( kalan 0 ) sağlamayanlar asaldır yazdırılır.
        if (isPrime) {
            System.out.println( number + " asal bir sayıdır.");
        }else{
            System.out.println(number + " asal bir sayı DEĞİLDİR.");
        }
    }
}
