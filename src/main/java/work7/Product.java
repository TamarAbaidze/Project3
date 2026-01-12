package work7;

public class Product {
    public double price;
    public double discount;

    public double finalPrice() {
        return price - (price * discount / 100);
    }
}
