package com.epam.sportsrental.controller;

import com.epam.sportsrental.services.CartService;
import com.epam.sportsrental.services.impl.CartServiceImpl;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class CartController implements ICartController, Controller {

    private CartService cartService;

    public CartController(){
        cartService = new CartServiceImpl();
    }
    @Override
    public void addToCart(int id) {
        cartService.addToCart(id);
    }

    @Override
    public void deleteFromCart(int id) {
        cartService.deleteFromCart(id);
    }
}
