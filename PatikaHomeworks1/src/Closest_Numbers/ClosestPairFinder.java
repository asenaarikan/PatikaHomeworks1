package Closest_Numbers;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class ClosestPairFinder {
    public static void main (String[] args){

        // Integer tipinde ArrayList oluştur.
        ArrayList<Integer> numbers = new ArrayList<>();

        // Benzersiz ve pozitif 10 eleman ekle.
        numbers.add(100);
        numbers.add(50);
        numbers.add(12);
        numbers.add(49);
        numbers.add(1);
        numbers.add(17);
        numbers.add(120);
        numbers.add(500);
        numbers.add(40);
        numbers.add(600);

        //Listi küçükten büyüğe sırala.
        Collections.sort(numbers);


        int minDiff = Integer.MAX_VALUE; // En küçük farkı bulmak için önce ona alabileceği en büyük değeri ver.
        int num1 = 0, num2 = 0;           // En yakın iki sayıyı tutacak değişkenleri tanımla.


        // Ardışık elemanların farklarını kontrol et.
        for (int i = 0; i < numbers.size() - 1; i++) {
            int diff = numbers.get(i + 1) - numbers.get(i);

            // Yeni değer, max integerdan küçük çıkacağı için minDiff güncellenecek, küçük oldukça yeni minDiff oluşur.
            if (diff < minDiff) {
                minDiff = diff;
                num1 = numbers.get(i);
                num2 = numbers.get(i + 1);
            }
        }

        // --- Sonucu yazdır ---
        System.out.println("Closest numbers: " + num1 + " and " + num2);
        System.out.println("Difference: " + minDiff);

    }


}
