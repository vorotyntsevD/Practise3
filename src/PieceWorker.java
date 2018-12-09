public class PieceWorker extends Employee {

    private int countOfMadeProducts;
    private int paymentForProduct;

    public PieceWorker(int countOfMadeProducts, int paymentForProduct, String firstName, String lastName) {
        this.countOfMadeProducts = countOfMadeProducts;
        this.paymentForProduct = paymentForProduct;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int paySalary() {
        return salary = countOfMadeProducts * paymentForProduct;
    }


}
