package com.epam.sportsrental.dao.impl;

import com.epam.sportsrental.dao.SearchDAO;
import com.epam.sportsrental.domain.Shop;
import com.epam.sportsrental.domain.SportEquipment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class SearchDAOImpl implements SearchDAO {

    @Override
    public Map<SportEquipment, Integer> search(String queryParam, String queryParamValue) {
        //Due to time constraint I am trying to search data from map object which is initialized application startup.
        //The best practice is to perform search in file and return data.

        Map<SportEquipment, Integer> goods = Shop.getGoods();

        Map<SportEquipment, Integer> searchResults = new HashMap<>();

        goods.forEach((k,v)->{
            if(queryParam.toUpperCase().equals("category".toUpperCase())
                    && k.getCategory().getName().toUpperCase().equals(queryParamValue.toUpperCase())){
                searchResults.put(k,v);
            } else if(queryParam.toUpperCase().equals("title".toUpperCase())
                    && k.getTitle().toUpperCase().equals(queryParamValue.toUpperCase())){
                searchResults.put(k,v);
            } else if(queryParam.equals("price") && k.getPrice() == Integer.parseInt(queryParamValue)){
                searchResults.put(k,v);
            } else {
                //Do nothing.
                System.out.println("nothing");
            }
        });

        return searchResults;
    }
}
