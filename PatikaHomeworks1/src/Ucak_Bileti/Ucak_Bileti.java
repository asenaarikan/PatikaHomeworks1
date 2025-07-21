
    import java.util.Scanner;

    public class Ucak_Bileti {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Mesafeyi km cinsinden giriniz: ");
            double mesafe = scanner.nextDouble();

            if (mesafe <= 0) {
                System.out.println("Hata: Mesafe 0'dan büyük olmalıdır.");
                return;
            }

            System.out.print("Yaşınızı giriniz: ");
            int yas = scanner.nextInt();

            if (yas <= 0) {
                System.out.println("Hata: Yaş 0'dan büyük olmalıdır.");
                return;
            }

            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
            int tip = scanner.nextInt();

            if (tip != 1 && tip != 2) {
                System.out.println("Hata: Yolculuk tipi sadece 1 (Tek Yön) veya 2 (Gidiş-Dönüş) olabilir.");
                return;
            }

            // Hesaplama başlıyor
            double normalTutar = mesafe * 0.10;

            double yasIndirimi = 0;
            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50;
            } else if (yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else if (yas > 65) {
                yasIndirimi = normalTutar * 0.30;
            }

            double indirimliTutar = normalTutar - yasIndirimi;

            if (tip == 2) {
                indirimliTutar *= 2;
                indirimliTutar -= indirimliTutar * 0.20;
            }

            System.out.printf("Toplam Bilet Fiyatı: %.2f TL%n", indirimliTutar);
        }
    }
