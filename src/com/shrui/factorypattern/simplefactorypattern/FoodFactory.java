package com.shrui.factorypattern.simplefactorypattern;

import com.shrui.factorypattern.simplefactorypattern.pojo.*;

public class FoodFactory {

    public static Food getFood(String FoodName){
        if (FoodName.equalsIgnoreCase("Bread")) {
            return new Bread();
        } else if (FoodName.equalsIgnoreCase("Ham")) {
            return new Ham();
        }else if (FoodName.equalsIgnoreCase("Noodles")) {
            return new Noodles();
        }else if (FoodName.equalsIgnoreCase("Steak")) {
            return new Steak();
        }else if (FoodName.equalsIgnoreCase("SteamedRice")) {
            return new SteamedRice();
        }else{
            return null;
        }
    }
}
