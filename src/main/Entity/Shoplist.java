package main.Entity;

import java.util.ArrayList;

public class Shoplist {
    private ArrayList<Goods> lst; // place that stored goods
    private Discount dis; // discount rate
    private float tex; // tax rate

    public Shoplist(){
        this.lst = new ArrayList<>();
        this.dis = new Discount(0);
        this.tex = 0;
    }

    public ArrayList<Goods> getLst() {
        return this.lst;
    }

    public float getDiscountRate() { return this.dis.getDis_percent();}

    public float getTex() {return this.tex;}

    public void setDiscountRate(float d) { this.dis.setDis_percent(d);}

    public void setTex(float d) { this.tex = d;}

}
