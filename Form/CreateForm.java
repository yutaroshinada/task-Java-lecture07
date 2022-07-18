package com.example.demo.Form;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

public class CreateForm {


    @NotBlank
    @Length(max = 20)
    private String menu;

    @Range(min = 1, max = 9999 )
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
