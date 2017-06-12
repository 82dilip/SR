package com.epam.sportsrental.dao;

import com.epam.sportsrental.domain.SportEquipment;

import java.util.List;
import java.util.Map;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public interface SearchDAO {

    Map<SportEquipment, Integer> search(String queryParam, String queryParamValue);
}
