package cakke;

public class BirthdayCake extends Cake{
    protected int candles;

    public BirthdayCake() {
        super();
        System.out.println("Six candles for the birthday cake");
    }


    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
