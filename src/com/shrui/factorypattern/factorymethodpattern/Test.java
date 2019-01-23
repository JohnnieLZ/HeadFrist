package com.shrui.factorypattern.factorymethodpattern;

public class Test  {

    public static void main(String[] args) {
        FStores fStores = new BenzFStores();
        fStores.drive();
        fStores.carInfo();
        fStores.SellingCars();
        fStores.drive();
        System.out.println("--------------------");
        fStores = new BMWFStores();
        fStores.drive();
        fStores.carInfo();
        fStores.SellingCars();
        fStores.drive();
        System.out.println("--------------------");
        fStores = new AudiFStores();
        fStores.drive();
        fStores.carInfo();
        fStores.SellingCars();
        fStores.drive();
    }
}
