package Sayi_Yuvarlama;
import java.util.Scanner;
public class SayiYuvarlama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ondalıklı sayı alma
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double sayi = scanner.nextDouble();

        // Aşağı, yukarı ve en yakın tam sayıya yuvarlama
        int asagiYuvarla = (int) Math.floor(sayi);
        int yukariYuvarla = (int) Math.ceil(sayi);
        int enYakinYuvarla = (int) Math.round(sayi);

        // Sonuçları ekrana yazdırma
        System.out.println("Aşağı yuvarlama: " + asagiYuvarla);
        System.out.println("Yukarı yuvarlama: " + yukariYuvarla);
        System.out.println("En yakın tam sayıya yuvarlama: " + enYakinYuvarla);
    }
}
