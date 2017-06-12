package com.epam.sportsrental.controller;

import com.epam.sportsrental.domain.RentUnit;
import com.epam.sportsrental.domain.Shop;
import com.epam.sportsrental.domain.SportEquipment;
import com.epam.sportsrental.representation.ShopRepresentation;

import java.util.Map;

/**
 * Created by Sydubabu_Vasantha on 6/9/2017.
 */
public class CommandLineController implements Controller {

    private static final String GOODS_AVAILABLE_MSG = "*****List of Goods Available*****";

    private static final String SEARCH_RESULTS_MSG = "*****Search Results*****";

    private static final String CART_MSG = "*****Checkout Cart Info*****";

    private static final String NO_ARGS_MSG = "No Arguments to process request";

    public static void main(String[] args) {
        System.out.println("----Welcome to Sports Rental App----");

        //Initialize file data as a first step of application initialization.
        InitializationController initializationController = new InitializationController();
        initializationController.initialize();

        Map<SportEquipment, Integer> goods = Shop.getGoods();

        if(args.length != 0){
            processRequest(args, goods);
        } else {
            System.out.println(NO_ARGS_MSG);
        }
    }

    private static void processRequest(String[] args, Map<SportEquipment, Integer> goods){
        String caseType = args[0];

        //I know this is not the best way to handle request from CMD. We may use AWT for better user interface.

        switch(caseType){
            case "a":
                //User can see the goods available
                ShopRepresentation.toRepresentation(GOODS_AVAILABLE_MSG, goods);
                break;

            case "b":
                //User can search by goods.
                if(args.length == 3){
                    //Expecting args[1] as query param and args[2] as query param value.
                    SearchController searchController = new SearchController();
                    Map<SportEquipment, Integer>  searchResults = searchController.search(args[1], args[2]);
                    ShopRepresentation.toRepresentation(SEARCH_RESULTS_MSG, searchResults);
                }

            case "c":
                //User can pick an equipment unit to rent – up to three units totally in a cart.
                //Expecting args[1] as id and args[2] as operation add/delete.
                ICartController cartController = new CartController();
                if(args.length == 3){
                    if(args[1].equals("add")){
                        cartController.addToCart(Integer.parseInt(args[2]));
                    } else if(args[1].equals("delete")){
                        cartController.deleteFromCart(Integer.parseInt(args[2]));
                    }
                    ShopRepresentation.toRepresentation(CART_MSG, RentUnit.getUnits());
                }

        }
    }
}
