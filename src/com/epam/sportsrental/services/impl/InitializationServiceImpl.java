package com.epam.sportsrental.services.impl;

import com.epam.sportsrental.dao.InitializationDAO;
import com.epam.sportsrental.dao.impl.InitializationDAOImpl;
import com.epam.sportsrental.services.InitializationService;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class InitializationServiceImpl implements InitializationService{

    private InitializationDAO initializationDAO;

    public InitializationServiceImpl(){
        initializationDAO = new InitializationDAOImpl();
    }
    @Override
    public void initialize() {
        initializationDAO.initialize();
    }
}
