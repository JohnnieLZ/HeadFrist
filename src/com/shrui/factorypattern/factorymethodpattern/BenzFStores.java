package com.shrui.factorypattern.factorymethodpattern;

import com.shrui.factorypattern.factorymethodpattern.pojo.BenzCar;
import com.shrui.factorypattern.factorymethodpattern.pojo.Car;

public class BenzFStores extends FStores {

    @Override
    Car CarFactory() {
        return new BenzCar().setBrand("奔驰").setMaxSpeed(320).setPrice("340W").setType("AMG");
    }
}
