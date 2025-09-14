package Maas_Hesaplayici;
public abstract class Employee {

    // Nitelikler
    protected String name;
    protected double salary;
    protected int workHours;
    protected int hireYear;

    // Kurucu Metotlar
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    // Ortak hesaplamalar için metotlar
    protected double tax() {
        if (salary <= 1000) return 0;
        return salary * 0.03;
    }

    protected double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    protected double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }


    // Polymorphism için abstract metot
    public abstract double calculateTotalSalary();

    // Bilgilendirme için ekran çıktısı
    @Override
    public abstract String toString();
}

