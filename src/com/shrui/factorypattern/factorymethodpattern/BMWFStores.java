package com.shrui.factorypattern.factorymethodpattern;

import com.shrui.factorypattern.factorymethodpattern.pojo.BmwCar;
import com.shrui.factorypattern.factorymethodpattern.pojo.Car;

public class BMWFStores extends FStores {

    @Override
    Car CarFactory() {
        return new BmwCar().setBrand("宝马").setMaxSpeed(280).setPrice("270W").setType("760Li");
    }
}
