package com.shrui.factorypattern.factorymethodpattern.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Car {

    private String type;

    private String price;

    private String brand;

    private Integer maxSpeed;
}
