package main;

import main.Entity.Shoplist;
import main.Service.impl.ShoplistServiceImpl;

public class demo {
    public static void main(String[] args){
        ShoplistServiceImpl spImp = new ShoplistServiceImpl();
        Shoplist sl = spImp.createShoplist();
        spImp.addGood("iPad", 100, 2, sl);
        spImp.addGood("Telephone", 150, 1, sl);
        spImp.addGood("iPad", 100, 1, sl);
        spImp.delGood("Telephone", 150, 1, sl);
        spImp.applyTex((float) 0.2, sl);
        spImp.applyDiscount((float) 0.2, sl);
        float ans = spImp.checkout(sl);
        System.out.println(ans);
    }
}
