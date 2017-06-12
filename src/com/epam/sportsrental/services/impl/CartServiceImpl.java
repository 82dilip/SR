package com.epam.sportsrental.services.impl;

import com.epam.sportsrental.dao.CartDAO;
import com.epam.sportsrental.dao.impl.CartDAOImpl;
import com.epam.sportsrental.services.CartService;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class CartServiceImpl implements CartService {

    private CartDAO cartDAO;

    public CartServiceImpl(){
        cartDAO = new CartDAOImpl();
    }
    @Override
    public void addToCart(int id) {
        cartDAO.addToCart(id);
    }

    @Override
    public void deleteFromCart(int id) {
        cartDAO.deleteFromCart(id);
    }
}
