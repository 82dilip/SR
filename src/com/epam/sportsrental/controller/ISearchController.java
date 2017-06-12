package com.epam.sportsrental.controller;

import com.epam.sportsrental.domain.SportEquipment;

import java.util.Map;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public interface ISearchController {

    Map<SportEquipment, Integer> search(String queryParam, String queryParamValue);
}
