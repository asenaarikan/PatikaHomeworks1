package Harf_Frekansi;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Harf_Frekansi_Bulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kelimeyi al
        System.out.print("Kelimeyi giriniz: ");
        String kelime = scanner.nextLine().toLowerCase();  // Küçük harfe çevir

        // Harflerin frekansını tutacak Map
        Map<Character, Integer> harfSayilari = new HashMap<>();
        for (char ch : kelime.toCharArray()) { // Her karakteri kontrol et
            if (Character.isLetter(ch)) {       // Sadece harfleri say
                harfSayilari.put(ch, harfSayilari.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : harfSayilari.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }

}
