package com.universe.demo.springboot.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Person {
    private BigDecimal id;
    private String name;
}
