package com.epam.sportsrental.domain;

/**
 * Created by Sydubabu_Vasantha on 6/9/2017.
 */
public class SportEquipment {

    private int id;
    private Category category;
    private String title;
    private int price;
    private  int quantity;

    public SportEquipment(int id, Category category, String title, int price, int quantity) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof SportEquipment)) {
            return false;
        }

        SportEquipment sportEquipment = (SportEquipment) o;

        return sportEquipment.id == id &&
                sportEquipment.price == price &&
                sportEquipment.category.equals(category) &&
                sportEquipment.title.equals(title);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + category.hashCode();
        result = 31 * result + price;
        result = 31 * result + title.hashCode();
        return result;
    }
}
