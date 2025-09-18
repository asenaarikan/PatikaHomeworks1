package Map_Entry_Yazdirma;
import java.util.HashMap;
import java.util.Map;

public class MapEntryYazdirma {
    public static void main(String[] args) {
        // HashMap oluşturuluyor
        Map<String, Integer> scores = new HashMap<>();

        // 5 farklı key-value çifti ekleniyor
        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // Map içindeki entry'ler satır satır yazdırılıyor
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
