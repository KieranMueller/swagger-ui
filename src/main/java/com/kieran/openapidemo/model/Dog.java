package com.kieran.openapidemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {

    private Long id;
    private String name;
    private String breed;
    private String color;
    private Integer age;
    private Double weightLbs;
}
