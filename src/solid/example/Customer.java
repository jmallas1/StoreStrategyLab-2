package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private char discountType;
    private SalePolicy salePolicy;

    public Customer(String customerName, double billAmount, SalePolicy sp) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.salePolicy = sp;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        double tempBill;
        tempBill = billAmount - (billAmount * salePolicy.getDiscount());
        /* switch(discountType) {
            case 'S':
            case 's': tempBill = billAmount - (billAmount * 0.1);
            case 'D':
            case 'd': tempBill = billAmount - (billAmount * 0.5);
            case 'L':
            case 'l': tempBill = billAmount - (billAmount * 0.75);
            default: tempBill = billAmount;
        }*/
        return tempBill;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + billAmount +
                ", discountType=" + discountType +
                '}';
    }
}
