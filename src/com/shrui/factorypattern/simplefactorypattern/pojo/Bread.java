package com.shrui.factorypattern.simplefactorypattern.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class Bread extends Food{

    private String shelfLife;

    @Builder//@Builder需要加在构造器上才能用到父类的属性
    public Bread(String type, String flavor, String shelfLife) {
        super(type, flavor);
        this.shelfLife = shelfLife;
    }

    public Bread() {
    }

    public Bread(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return super.toString()+"Bread{" +
                "shelfLife='" + shelfLife + '\'' +
                '}';
    }
}
