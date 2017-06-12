package com.epam.sportsrental.dao.impl;

import com.epam.sportsrental.dao.CartDAO;
import com.epam.sportsrental.domain.RentUnit;
import com.epam.sportsrental.domain.Shop;
import com.epam.sportsrental.domain.SportEquipment;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class CartDAOImpl implements CartDAO {

    private static final int CART_SIZE = 3;

    @Override
    public void addToCart(int id) {
        if(RentUnit.getUnits().size() <= CART_SIZE){
            Map<SportEquipment, Integer> goods = Shop.getGoods();
            SportEquipment sportEquipment = getSportEquipment(goods.keySet(), id);
            RentUnit.getUnits().add(sportEquipment);

            //TODO update the available quantity Shop.getGoods();
        }
    }

    @Override
    public void deleteFromCart(int id) {
        deleteSportEquipment(RentUnit.getUnits(), id);
        //TODO update the available quantity Shop.getGoods();
    }

    private SportEquipment getSportEquipment(Set<SportEquipment> sportEquipments, int id){

        Optional<SportEquipment> sportEquipmentToAdd = sportEquipments.stream()
                .filter(sportEquipment -> sportEquipment.getId() == id)
                .findFirst();
        return sportEquipmentToAdd.get();
    }

    private void deleteSportEquipment(List<SportEquipment> sportEquipments, int id){

        sportEquipments.removeIf(sportEquipment -> sportEquipment.getId() == id);

    }
}
