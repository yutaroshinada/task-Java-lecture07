package com.example.demo.Form;

import org.springframework.lang.NonNull;

public class UpdateForm {
    @NonNull
    private String menu;
    @NonNull
    private int price;


    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
