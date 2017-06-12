package com.epam.sportsrental.representation;

import com.epam.sportsrental.domain.SportEquipment;

import java.util.List;
import java.util.Map;

/**
 * Class to represent
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class ShopRepresentation {

    private static final String HEADERS = "ID, CATEGORY, TITLE, PRICE, QUANTITY";

    public ShopRepresentation() {
    }

    public static void toRepresentation(String message, Map<SportEquipment, Integer> goods){
        System.out.println(message);
        System.out.println(HEADERS);

        goods.forEach((k,v)->System.out.println(k.getId() + "," + k.getCategory().getName() + ", " + k.getTitle()+ ", " + k.getPrice() + ", " + k.getQuantity()));
    }

    public static void toRepresentation(String message, List<SportEquipment> sportEquipments){
        System.out.println(message);
        System.out.println(HEADERS);

        sportEquipments.forEach(sportEquipment ->System.out.println(sportEquipment.getId() + ","
                + sportEquipment.getCategory().getName() + ", " + sportEquipment.getTitle()+ ", "
                + sportEquipment.getPrice() + ", " + sportEquipment.getQuantity()));
    }
}
