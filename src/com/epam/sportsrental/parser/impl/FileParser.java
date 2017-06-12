package com.epam.sportsrental.parser.impl;

import com.epam.sportsrental.domain.Category;
import com.epam.sportsrental.domain.Shop;
import com.epam.sportsrental.domain.SportEquipment;
import com.epam.sportsrental.parser.IParser;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sydubabu_Vasantha on 6/12/2017.
 */
public class FileParser implements IParser {

    private final String FILE_NAME = "/data.txt";

    private final String COLUMN_SEPARATOR = ",";

    private final int ID_POSITION = 0;

    private final int CATEGORY_POSITION = 1;

    private final int TITLE_POSITION = 2;

    private final int PRICE_POSITION = 3;

    private final int QUANTITY_POSITION = 4;

    @Override
    public void parse() {
        File file = new File(FileParser.class.getResource(FILE_NAME).getFile());

        Shop shop = new Shop();
        Map<SportEquipment, Integer> shopDetails = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                SportEquipment sportsEquipment = readDataFromLine(line);

                shopDetails.put(sportsEquipment, sportsEquipment.getQuantity());
            }
            shop.addGoods(shopDetails);
        } catch (FileNotFoundException e) {
            System.err.println("Exception occurred while reading file " + e.getMessage());

        } catch (IOException e) {
            System.err.println("Exception occurred while processing file " + e.getMessage());

        }
    }

    private SportEquipment readDataFromLine(String line) throws IOException {
        String rowData[] = line.split(COLUMN_SEPARATOR);

        String id = rowData[ID_POSITION];

        Category categoryValue = new Category(rowData[CATEGORY_POSITION]);

        String title = rowData[TITLE_POSITION];

        String price = rowData[PRICE_POSITION];

        String quantity = rowData[QUANTITY_POSITION];

        SportEquipment sportsEquipment = new SportEquipment(Integer.parseInt(id), categoryValue,
                title, Integer.parseInt(price), Integer.parseInt(quantity));

        return sportsEquipment;
    }
}
