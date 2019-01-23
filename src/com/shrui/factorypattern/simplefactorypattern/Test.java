package com.shrui.factorypattern.simplefactorypattern;

import com.shrui.factorypattern.simplefactorypattern.pojo.*;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Food> foods1 = eat1("Whites");
        List<Food> foods2 = eat2("Whites");
        foods1.forEach(System.out::println);
        foods2.forEach(System.out::println);
    }

    static List<Food> eat1(String race) {
        List<Food> foods = new ArrayList<>();
        Food stapleFood1 = null;
        Food stapleFood2 = null;
        Food food = null;
        //强耦合
        if (race.equalsIgnoreCase("Whites")) {
            stapleFood1 = Steak.builder().flavor("咸").type("300g").cooked("5分熟").build();
            stapleFood2 = Bread.builder().type("现做").flavor("甜").shelfLife("3").build();
            food = Ham.builder().flavor("甜").size("Big").build();
        } else if (race.equalsIgnoreCase("YellowRace")) {
            stapleFood1 = SteamedRice.builder().flavor("清香").type("大米").build();
            stapleFood2 = Noodles.builder().flavor("咸辣酸").type("小麦").build();
        }
        foods.add(stapleFood1);
        foods.add(stapleFood2);
        foods.add(food);
        return foods;
    }

    static List<Food> eat2(String race) {
        List<Food> foods = new ArrayList<>();
        Food stapleFood1;
        Food stapleFood2;
        Food food;
        if (race.equalsIgnoreCase("Whites")) {
            //通过类名可以获得相应的对象
            stapleFood1 = FoodFactory.getFood("Steak");
            stapleFood2 = FoodFactory.getFood("Bread");
            food = FoodFactory.getFood("Ham");
            foods.add(stapleFood1);
            foods.add(stapleFood2);
            foods.add(food);
        } else if (race.equalsIgnoreCase("YellowRace")) {
            stapleFood1 = FoodFactory.getFood("SteamedRice");
            stapleFood2 = FoodFactory.getFood("Noodles");
            foods.add(stapleFood1);
            foods.add(stapleFood2);
        }
        return foods;
    }

}
