package com.shrui.factorypattern.simplefactorypattern.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class SteamedRice extends Food{

    public SteamedRice() {
    }

    @Builder
    public SteamedRice(String type, String flavor) {
        super(type, flavor);
    }
}
