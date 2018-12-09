import java.util.ArrayList;

/*
       Предприятие с 5-ти часовым графиком работы, БЕЗ ВЫХОДНЫХ
*/

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList();

        Boss boss = new Boss(100, "Ivan", "Nachal'nik");
        employees.add(boss);

        HourlyWorker hourlyWorker1 = new HourlyWorker(40, 50, "Denis", "Sverdlov");
        HourlyWorker hourlyWorker2 = new HourlyWorker(50, 50, "Petr", "Sumtsov");
        employees.add(hourlyWorker1);
        employees.add(hourlyWorker2);

        PieceWorker pieceWorker1 = new PieceWorker(300, 30, "Murat", "Nagorniy");
        PieceWorker pieceWorker2 = new PieceWorker(250, 30, "Bogdan", "Borovoy");
        employees.add(pieceWorker1);
        employees.add(pieceWorker2);

        CommissionWorker commissionWorker1 = new CommissionWorker(275, 10, 5500, "Fedor", "Petrov");
        CommissionWorker commissionWorker2 = new CommissionWorker(275, 5, 6500, "Roman", "Dolmatov");
        commissionWorker1.setCostOfProduct(100);
        commissionWorker2.setCostOfProduct(100);
        employees.add(commissionWorker1);
        employees.add(commissionWorker2);

        int totalPayment = boss.paySalary() + hourlyWorker1.paySalary() + hourlyWorker2.paySalary() + pieceWorker1.paySalary() + pieceWorker2.paySalary() + commissionWorker1.paySalary() + commissionWorker2.paySalary();
        System.out.println("За декабрь 2018 выплачено: " + totalPayment + " грн");

        //boss.displayWorkersName();

    }

}
