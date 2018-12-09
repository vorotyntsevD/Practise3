public class Boss extends Employee {

    private int paymentPerHour;

    public Boss(int paymentPerHour, String firstName, String lastName) {
        this.paymentPerHour = paymentPerHour;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int paySalary() {
        return salary = paymentPerHour * WORK_HOURS * daysInMonth;
    }


}
