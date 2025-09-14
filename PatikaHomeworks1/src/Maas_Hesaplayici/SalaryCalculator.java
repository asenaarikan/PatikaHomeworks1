package Maas_Hesaplayici;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çalışanın adı ve soyadı: ");
        String name = scanner.nextLine();

        System.out.print("Maaşı: ");
        double salary = scanner.nextDouble();

        System.out.print("Haftalık çalışma saati: ");
        int workHours = scanner.nextInt();

        System.out.print("İşe giriş yılı: ");
        int hireYear = scanner.nextInt();
        scanner.nextLine(); // Enter tuşunu temizle

        Employee emp = new FactoryEmployee(name, salary, workHours, hireYear);

        System.out.println("---------------------------");
        System.out.println(emp);

        scanner.close();
    }
}
