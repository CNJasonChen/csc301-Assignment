package main.Entity;

public class Goods {
    private float price; // price for one item
    private int amount; // amount of items
    private String name; // item's name

    public Goods(String n, float p, int a) {
        this.name = n;
        this.price = p;
        this.amount = a;
    }

    public float getPrice() {
        return this.price;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getName() { return this.name;}

    public void setAmount(int i) { this.amount = i;}
}
