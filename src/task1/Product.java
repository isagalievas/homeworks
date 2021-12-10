package task1;

public class Product {
  private String name;
  private double price;
  private int validDays;

    public Product(String name, double price, int validDays) {
        this.name = name;
        this.price = price;
        this.validDays = validDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
