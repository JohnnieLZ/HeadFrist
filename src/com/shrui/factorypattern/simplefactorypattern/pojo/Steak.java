package com.shrui.factorypattern.simplefactorypattern.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Steak extends Food{

    private String cooked;

    public Steak(String cooked) {
        this.cooked = cooked;
    }

    public Steak() {
    }

    @Builder
    public Steak(String type, String flavor, String cooked) {
        super(type, flavor);
        this.cooked = cooked;
    }
}
