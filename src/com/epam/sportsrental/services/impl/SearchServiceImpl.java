package com.epam.sportsrental.services.impl;

import com.epam.sportsrental.dao.SearchDAO;
import com.epam.sportsrental.dao.impl.SearchDAOImpl;
import com.epam.sportsrental.domain.SportEquipment;
import com.epam.sportsrental.services.SearchService;

import java.util.Map;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class SearchServiceImpl implements SearchService{

    SearchDAO searchDAO;

    public SearchServiceImpl(){
        searchDAO = new SearchDAOImpl();
    }
    @Override
    public Map<SportEquipment, Integer> search(String queryParam, String queryParamValue) {

        return searchDAO.search(queryParam, queryParamValue);
    }
}
