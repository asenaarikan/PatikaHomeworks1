package RecordsHomework;

public class Main {
    public static void main(String[] args) {


        // Record nesneleri oluşturma
        Student s1 = new Student("Aslı", "Yılmaz", 101);
        Student s2 = new Student("Ahmet", "Demir", 102);
        Student s3 = new Student("Aslı", "Yılmaz", 101); // s1 ile aynı değerler
        Student s4 = new Student("Aslı", "yılmaz", 101);

        // Bilgileri ekrana yazdırma
        System.out.println("Öğrenci 1: " + s1);
        System.out.println("Öğrenci 2: " + s2);
        System.out.println("Öğrenci 3: " + s3);
        System.out.println("Öğrenci 4: " + s4);

        // equals ve hashCode kontrolü
        System.out.println("\ns1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s1.hashCode() == s3.hashCode(): " + (s1.hashCode() == s3.hashCode())); // true

        System.out.println("\ns1.equals(s4): " + s1.equals(s4)); //false
        System.out.println("s1.hashCode() == s4.hashCode(): " + (s1.hashCode() == s4.hashCode())); //false

        // Ek metodu kullanma
        System.out.println("\nTam Ad: " + s1.fullName()); // Aslı Yılmaz
        System.out.println("\nTam Ad: " + s4.fullName()); // Aslı yılmaz
    }
}
