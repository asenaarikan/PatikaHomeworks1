package ArtikYil;

import java.util.Scanner;

public class Artik_Yil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.print("Bir yıl giriniz: ");
    int yil = input.nextInt();

    // Artık yıl kontrolü
    boolean artikYilMi;

    if (yil % 4 == 0) {
        if (yil % 100 == 0) {

            // Yıl hem 4'e hem 100'e bölünüyor, 400'e bölünmesine bakılır
            if (yil % 400 == 0) {
                artikYilMi = true;
            } else {
                artikYilMi = false;
            }
        } else {

            // 4'e bölünüyor ama 100'e değil
            artikYilMi = true;
        }
    } else {


        // 4'e bile bölünemiyor
        artikYilMi = false;
    }



    // Sonuç çıktısı
    if (artikYilMi) {
        System.out.println(yil + " bir artık yıldır.");
    } else {
        System.out.println(yil + " bir artık yıl değildir.");
    }
}

}
