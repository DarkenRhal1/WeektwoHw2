package cakke;

public class WeddingCake extends Cake{
    protected byte tiers;

    public WeddingCake() {
        super();
        System.out.println("Four tiers for the weeding cake");

    }

    public byte getTiers() {
        return tiers;
    }

    public void setTiers(byte tiers) {
        this.tiers = tiers;
    }
}
