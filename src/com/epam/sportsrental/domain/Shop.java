package com.epam.sportsrental.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sydubabu_Vasantha on 6/9/2017.
 */
public class Shop {

    private static Map<SportEquipment, Integer> goods = new HashMap<>();

    public Shop() {

    }

    public Shop(Map<SportEquipment, Integer> goods) {
        this.goods = goods;
    }

    public static Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public void setGoods(Map<SportEquipment, Integer> goods) {
        this.goods = goods;
    }

    public void addGoods(Map<SportEquipment, Integer> goods){
        this.goods.putAll(goods);
    }
}
