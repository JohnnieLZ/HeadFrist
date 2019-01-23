package com.shrui.factorypattern.simplefactorypattern.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class Ham extends Food{

    private String size;

    @Builder
    public Ham(String type, String flavor, String size) {
        super(type, flavor);
        this.size = size;
    }

    public Ham(String size) {
        this.size = size;
    }

    public Ham() {}
}
