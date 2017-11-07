package flower;

public abstract class BaseFlower {
    public  double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void show();
}