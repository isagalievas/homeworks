package task3;

public class Milk {
    private double price;
    private int validDays;

    public Milk(double price, int validDays) {
        this.price = price;
        this.validDays = validDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getValidDays() {
        return validDays;
    }

    public void setValidDays(int validDays) {
        this.validDays = validDays;
    }
    @Override
    public String toString() {
        String message = "Цена" + this.price + ", срок годность " + this.validDays + " дней";
        return message;

    }
}
