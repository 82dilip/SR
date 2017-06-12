package com.epam.sportsrental.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sydubabu_Vasantha on 6/9/2017.
 */
public class RentUnit {

    private static List<SportEquipment> units = new ArrayList<>();

    public RentUnit() {

    }

    public static List<SportEquipment> getUnits() {
        return units;
    }

    public void setUnits(List<SportEquipment> units) {
        this.units = units;
    }

    public void addUnits(SportEquipment sportEquipment){
        units.add(sportEquipment);
    }
}
