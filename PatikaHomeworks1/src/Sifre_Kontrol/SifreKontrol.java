package Sifre_Kontrol;
import java.util.Scanner;
public class SifreKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sifre;


// Kullanıcından şifre oluşturması istenir.
        while (true) {
            System.out.print("Şifrenizi oluşturunuz: ");
            sifre = scanner.nextLine();

            boolean gecerli = true;

            // 1. Uzunluk kontrolü
            if (sifre.length() < 8) {
                System.out.println("HATA: Şifre en az 8 karakter olmalı.");
                gecerli = false;
            }

            // 2. Boşluk kontrolü
            if (sifre.contains(" ")) {
                System.out.println("HATA: Şifre boşluk karakteri içermemeli.");
                gecerli = false;
            }

            // 3. İlk harf büyük mü?
            if (!Character.isUpperCase(sifre.charAt(0))) {
                System.out.println("HATA: Şifre büyük harf ile başlamalı.");
                gecerli = false;
            }

            // 4. Son karakter '?'
            if (sifre.charAt(sifre.length() - 1) != '?') {
                System.out.println("HATA: Şifre '?' ile bitmeli.");
                gecerli = false;
            }

            if (gecerli) {
                System.out.println("Geçerli Şifre");
                break;
            } else {
                System.out.println("Lütfen şifrenizi tekrar giriniz.\n");
            }
        }
    }
}
