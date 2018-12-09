public class CommissionWorker extends Employee {

    private int countOfSellProducts;
    private int costOfProduct;
    private int percentFromSell;
    private int basePayment;

    public void setCostOfProduct(int costOfProduct) {
        this.costOfProduct = costOfProduct;

    }

    public CommissionWorker(int countOfSellProducts, int percentFromSell, int basePayment, String firstName, String lastName) {
        this.countOfSellProducts = countOfSellProducts;
        this.percentFromSell = percentFromSell;
        this.basePayment = basePayment;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int paySalary() {
        return salary = basePayment + countOfSellProducts * costOfProduct / percentFromSell;
    }


}