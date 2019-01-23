package com.shrui.factorypattern.factorymethodpattern;

import com.shrui.factorypattern.factorymethodpattern.pojo.AudiCar;
import com.shrui.factorypattern.factorymethodpattern.pojo.Car;

public class AudiFStores extends FStores {

    @Override
    Car CarFactory() {
        return new AudiCar().setBrand("奥迪").setMaxSpeed(355).setPrice("280W").setType("R8");
    }
}
