package solid.example;

public class BaseSale implements SalePolicy
{
    @Override
    public float getDiscount() {
        return 0.1f;
    }
}
