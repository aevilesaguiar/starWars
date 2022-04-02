package com.bootcampjava.starwars.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jedi {
    private Long id;
    private String name;
    private int strength;
    private int version;

}
