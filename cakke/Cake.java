package cakke;

public class Cake {
    protected String name;
    protected double price;
    public Cake() {
        System.out.println("Gifted cakes");
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
}
