package Lambda_Example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class LambdaExample {
    public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    // Lambda ile sayıları iki katına çıkarma ve listeye atama
    numbers = numbers.stream()
            .map(n -> n * 2)   // her sayıyı 2 ile çarp
            .collect(Collectors.toList());

    // Lambda ile sonuçları yazdırma
    numbers.forEach(n -> System.out.println(n));
}
}
