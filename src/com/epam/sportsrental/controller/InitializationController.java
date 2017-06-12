package com.epam.sportsrental.controller;

import com.epam.sportsrental.services.InitializationService;
import com.epam.sportsrental.services.impl.InitializationServiceImpl;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class InitializationController implements IInitializationController, Controller {

    private InitializationService initializationService;

    public InitializationController(){
        initializationService = new InitializationServiceImpl();
    }
    @Override
    public void initialize() {
        //Initialize file data as a first step of application initialization.
        initializationService.initialize();
    }
}
