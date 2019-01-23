package com.shrui.factorypattern.simplefactorypattern.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    private String type;
    private String flavor;
}
