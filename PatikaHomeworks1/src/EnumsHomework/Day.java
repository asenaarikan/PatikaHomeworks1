package EnumsHomework;

public enum Day {
    SUNDAY("TATİL GÜNÜ"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("10:00 - 14:00");


    private final String workingHours;

    // Enum sabitlerinin değerlerini atayan kurucu (constructor) metot
    Day(String workingHours){
        this.workingHours = workingHours;
    }
    // Çalışma saatini döndüren metot
    public String getWorkingHours() {
        return workingHours;
    }
}

