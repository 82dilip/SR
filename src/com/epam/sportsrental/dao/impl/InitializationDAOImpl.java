package com.epam.sportsrental.dao.impl;

import com.epam.sportsrental.dao.InitializationDAO;
import com.epam.sportsrental.parser.IParser;
import com.epam.sportsrental.parser.impl.FileParser;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class InitializationDAOImpl implements InitializationDAO {

    @Override
    public void initialize() {
        IParser fileParser = new FileParser();
        fileParser.parse();
    }
}
