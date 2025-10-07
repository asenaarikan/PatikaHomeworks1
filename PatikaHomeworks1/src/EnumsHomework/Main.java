package EnumsHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Haftanın bir gününü giriniz (örnek: MONDAY):");
        String userInput = input.nextLine().trim().toUpperCase();

        try {
            Day selectedDay = Day.valueOf(userInput);
            System.out.println(selectedDay + " günü çalışma saatleri: " + selectedDay.getWorkingHours());
        } catch (IllegalArgumentException e) {
            System.out.println("Geçersiz gün girdiniz. Lütfen örnek biçimde yazın (örnek: MONDAY).");
        }
    }
}
