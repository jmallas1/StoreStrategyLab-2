package solid.example;

public class DiscountSale implements SalePolicy
{

    @Override
    public float getDiscount() {
        return 0.5f;
    }
}
