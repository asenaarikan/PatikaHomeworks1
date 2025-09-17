package Harf_Bulma_Oyunu;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class HarfBulmaOyunu {
    public static void main(String[] args) {

        // 1. ArrayList oluşturma
        ArrayList<String> harfListesi = new ArrayList<>();
        Random rand = new Random();

        // 2. Rastgele 4 harf ekleme (A-Z arası)
        for (int i = 0; i < 4; i++) {
            char randomHarf = (char) ('A' + rand.nextInt(26)); // 26 adet harf arasından
            harfListesi.add(String.valueOf(randomHarf));
        }

        // Başlangıç listesini göster
        System.out.println("Başlangıç harf listesi: " + harfListesi);

        Scanner scanner = new Scanner(System.in);

        // 3. Kullanıcıdan 4 harf alma ve işleme
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ". harfi giriniz: ");
            String girilenHarf = scanner.next().toUpperCase();

            if (harfListesi.contains(girilenHarf)) {

                // Harf listede varsa "found" ile değiştir
                int index = harfListesi.indexOf(girilenHarf);
                harfListesi.set(index, "found");
            } else {
                // Harf listede yoksa listeye ekle
                harfListesi.add(girilenHarf);
            }
        }

        // 4. Güncellenmiş listeyi göster
        System.out.println("Güncellenmiş harf listesi: " + harfListesi);

        scanner.close();
    }
}
