public class HourlyWorker extends Employee {

    private int workHoursPerWeek;
    private int paymentPerHour;

    public HourlyWorker(int workHoursPerWeek, int paymentPerHour, String firstName, String lastName) {
        this.workHoursPerWeek = workHoursPerWeek;
        this.paymentPerHour = paymentPerHour;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int paySalary() {
        for (int i = 0; i < workHoursPerWeek; i++) {

            if (i <= WORK_HOURS * daysInMonth) {
                salary += paymentPerHour;
            } else if (i > WORK_HOURS * daysInMonth) {
                salary += paymentPerHour + paymentPerHour * 2;
            }

        }
        return salary;
    }


}
