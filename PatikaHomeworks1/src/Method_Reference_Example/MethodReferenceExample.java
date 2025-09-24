package Method_Reference_Example;
import java.util.ArrayList;
import java.util.List;
public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // Method reference ile liste elemanlarını yazdırma
        names.forEach(System.out::println);
    }
}
