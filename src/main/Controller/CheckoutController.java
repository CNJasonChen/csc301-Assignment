package main.Controller;

import main.Entity.Shoplist;
import main.Service.ShoplistService;
import main.Service.impl.ShoplistServiceImpl;

public class CheckoutController {
    private ShoplistServiceImpl slImp;

    public float checkout(){
        return slImp.checkout(slImp.createShoplist());
    }
}
