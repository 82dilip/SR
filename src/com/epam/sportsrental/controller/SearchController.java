package com.epam.sportsrental.controller;

import com.epam.sportsrental.domain.SportEquipment;
import com.epam.sportsrental.services.SearchService;
import com.epam.sportsrental.services.impl.SearchServiceImpl;

import java.util.Map;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class SearchController implements ISearchController, Controller {

   private SearchService searchService;

   public SearchController(){
       searchService = new SearchServiceImpl();
   }
    @Override
    public Map<SportEquipment, Integer> search(String queryParam, String queryParamValue) {
        return searchService.search(queryParam, queryParamValue);
    }
}
