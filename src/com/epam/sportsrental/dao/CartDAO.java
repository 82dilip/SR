package com.epam.sportsrental.dao;

import com.epam.sportsrental.domain.RentUnit;

import java.util.List;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public interface CartDAO {

    void addToCart(int id);

    void deleteFromCart(int id);
}
