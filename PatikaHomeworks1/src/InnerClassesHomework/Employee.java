package InnerClassesHomework;

public class Employee {
    private String firstName;
    private String lastName;
    private ContactInfo contactInfo; // İç sınıf referansı

    // Constructor
    public Employee(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        // İç sınıf nesnesi dış sınıf içinde oluşturuluyor
        this.contactInfo = new ContactInfo(phone, email);
    }

    // İç sınıf (Inner Class)
    public class ContactInfo {
        private String phoneNumber;
        private String email;

        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // İletişim bilgilerini göstermek için metot
        public void displayContactInfo() {
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + email);
        }
    }

    // Çalışan bilgilerini ve iletişim bilgilerini birlikte gösteren metot
    public void displayEmployeeDetails() {
        System.out.println("Employee: " + firstName + " " + lastName);
        contactInfo.displayContactInfo();
    }

    // Main metodu test için
    public static void main(String[] args) {
        Employee employee = new Employee("Asena", "Arıkan", "0555-123-4567", "asena.arikan@example.com");
        employee.displayEmployeeDetails();
    }
}
