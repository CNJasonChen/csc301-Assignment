package main.Service.impl;

import main.Entity.Goods;
import main.Entity.Shoplist;
import main.Service.ShoplistService;

import java.util.Objects;

public class ShoplistServiceImpl implements ShoplistService {

    public float checkout(Shoplist sl) {
        // summary of all cost
        // set tex and discount rate should be done before checkout
        float acc = 0;
        for (int i = 0; i < sl.getLst().size(); i++){
            Goods g = sl.getLst().get(i);
            acc += g.getPrice() * g.getAmount();
        }
        return acc * (1 - sl.getDiscountRate()) * (1 + sl.getTex());
    }

    public void addGood(String name, int price, int amount, Shoplist sl) {
        Goods g = new Goods(name, price, amount);

        // check if the goods is already exist in shoplist
        for (int i = 0; i < sl.getLst().size(); i++){
            if (Objects.equals(sl.getLst().get(i).getName(), name)){
                sl.getLst().get(i).setAmount(sl.getLst().get(i).getAmount() + amount);
                return;
            }
        }

        // if reach this line, added good is not in shoplist
        sl.getLst().add(g);
    }

    public void delGood(String name, float price, int amount, Shoplist sl) {
        Goods g = new Goods(name, price, amount);
        for (int i = 0; i < sl.getLst().size(); i++){
            if (Objects.equals(sl.getLst().get(i).getName(), name)){
                sl.getLst().remove(i);
                return;
            }
        }
    }

    public void applyDiscount(float d, Shoplist sl) {
        // noted that discount rate is 0~1
        sl.setDiscountRate(d);
    }

    public void applyTex(float tex_percent, Shoplist sl) {
        // noted that text_percent is 0~1
        sl.setTex(tex_percent);
    }

    public Shoplist createShoplist(){
        return new Shoplist();
    }
}
