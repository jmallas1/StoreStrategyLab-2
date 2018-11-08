package solid.example;

public class LiquidationSale implements SalePolicy
{

    @Override
    public float getDiscount() {
        return 0.75f;
    }
}
