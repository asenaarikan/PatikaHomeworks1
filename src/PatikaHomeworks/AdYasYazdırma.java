package PatikaHomeworks;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AdYasYazdırma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız: ");
        String name = scanner.nextLine();

        System.out.println("yaşınız: ");
        int age = scanner.nextInt();

        System.out.println("Merhaba " + name + " ," + age + " yaşındasın!");

        scanner.close();
    }
}