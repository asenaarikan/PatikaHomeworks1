package Maas_Hesaplayici;

public class FactoryEmployee extends Employee {


    public FactoryEmployee(String name, double salary, int workHours, int hireYear) {
        super(name, salary, workHours, hireYear);
    }

    @Override
    public double calculateTotalSalary() {
        return salary - tax() + bonus() + raiseSalary();
    }

    @Override
    public String toString() {
        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() +
                "\nToplam Maaş: " + calculateTotalSalary();
    }

}
