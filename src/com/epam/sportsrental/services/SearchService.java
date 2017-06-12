package com.epam.sportsrental.services;

import com.epam.sportsrental.domain.SportEquipment;

import java.util.Map;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public interface SearchService {

    Map<SportEquipment, Integer> search(String queryParam, String queryParamValue);
}
