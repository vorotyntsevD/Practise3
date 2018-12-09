import java.time.YearMonth;

public abstract class Employee {
    int salary;
    String firstName;
    String lastName;
    final int WORK_HOURS = 5;

    YearMonth yearMonthObject = YearMonth.of(2018, 11);
    int daysInMonth = yearMonthObject.lengthOfMonth();

    abstract int paySalary();

    public void displayWorkersName() {
        String s = getClass().toString() + " — " + firstName + " " + lastName;
        System.out.println(s.substring(6));
    }
}