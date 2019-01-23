package com.shrui.factorypattern.factorymethodpattern;

import com.shrui.factorypattern.factorymethodpattern.pojo.Car;

public abstract class FStores {


    private boolean key = false;

    public void drive() {
        if (key)
            System.out.println("用你的钥匙开走它吧");
        else
            System.out.println("你没有钥匙不能把车开走！");
    }

    public void SellingCars() {
        key = true;
        System.out.println("恭喜你提了辆"+CarFactory().getBrand()+"，钥匙给你");
    }

    abstract Car CarFactory();

    public void carInfo() {
        System.out.println(CarFactory().toString());
    }
}
