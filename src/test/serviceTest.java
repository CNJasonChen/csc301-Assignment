package test;

import main.Entity.Shoplist;
import main.Service.impl.ShoplistServiceImpl;
import org.junit.Test;

import java.util.Objects;

import static java.lang.Math.floor;
import static org.junit.Assert.*;

public class serviceTest {
    ShoplistServiceImpl slImp = new ShoplistServiceImpl();

    @Test
    public void testAddGood(){
        Shoplist sl = slImp.createShoplist();
        slImp.addGood("iPhone", 100, 2, sl);
        boolean isAdded = false;
        for (int i = 0; i < sl.getLst().size(); i++){
            if (Objects.equals(sl.getLst().get(i).getName(), "iPhone") &&
                    sl.getLst().get(i).getAmount() == 2 &&
                    sl.getLst().get(i).getPrice() == 100) {
                isAdded = true;
                break;
            }
        }
        assertTrue(isAdded);
    }

    @Test
    public void testDeleteGood(){
        Shoplist sl = slImp.createShoplist();
        slImp.addGood("iPhone", 100, 2, sl);
        slImp.delGood("iPhone", 100, 2, sl);
        for (int i = 0; i < sl.getLst().size(); i++){
            if (Objects.equals(sl.getLst().get(i).getName(), "iPhone") &&
                    sl.getLst().get(i).getAmount() == 2 &&
                    sl.getLst().get(i).getPrice() == 100) {
                assertFalse(false);
            }
        }
        assertTrue(true);
    }

    @Test
    public void testCheckout(){
        Shoplist sl = slImp.createShoplist();
        slImp.addGood("iPhone", 100, 2, sl);
        assert((float)200.0 == slImp.checkout(sl));
    }

    @Test
    public void testApplyDiscount(){
        Shoplist sl = slImp.createShoplist();
        slImp.addGood("iPhone", 100, 2, sl);
        slImp.applyDiscount((float) 0.2, sl);
        assert((float)160.0 == slImp.checkout(sl));
    }

    @Test
    public void testApplyTex(){
        Shoplist sl = slImp.createShoplist();
        slImp.addGood("iPhone", 100, 2, sl);
        slImp.applyTex((float) 0.2, sl);
        assert((float)240.0 == floor(slImp.checkout(sl)));
    }
}
