package main.Service;

import main.Entity.Shoplist;

public interface ShoplistService {
    float checkout(Shoplist sl);

    void addGood(String name, int price, int amount, Shoplist sl);

    void delGood(String name, float price, int amount, Shoplist sl);

    void applyDiscount(float d, Shoplist sl);

    void applyTex(float tex_percent, Shoplist sl);

    Shoplist createShoplist();
}
