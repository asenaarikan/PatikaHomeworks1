package Ucak_Bilet_Fiyati_Programi;
import java.util.Scanner;
public class UcakBiletiFiyatı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan girişleri al
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        double mesafe = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int tip = scanner.nextInt();

        // Geçersiz veri kontrolü
        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Normal tutar
        double normalTutar = mesafe * 0.10;

        // Yaş indirimi
        double yasIndirimi = 0;
        if (yas < 12) {
            yasIndirimi = normalTutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = normalTutar * 0.10;
        } else if (yas > 65) {
            yasIndirimi = normalTutar * 0.30;
        }

        double indirimliTutar = normalTutar - yasIndirimi;

        // Gidiş-Dönüş indirimi
        if (tip == 2) {
            indirimliTutar = indirimliTutar * 2; // önce ikiyle çarp
            indirimliTutar = indirimliTutar - (indirimliTutar * 0.20); // sonra %20 indirim
        }

        System.out.println("Toplam Bilet Fiyatı: " + indirimliTutar + " TL");

    }
}
