package main.Entity;

public class Discount {
    private float dis_percent; // discount rate. the price after applied discount should be (1-discount)

    public Discount(int d){
        this.dis_percent = d;
    }

    public float getDis_percent() {
        return this.dis_percent;
    }

    public void setDis_percent(float d) { this.dis_percent = d;}
}
