package com.shrui.factorypattern.simplefactorypattern.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Noodles extends Food{


    @Builder
    public Noodles(String type, String flavor) {
        super(type, flavor);
    }

    public Noodles() {
    }
}
