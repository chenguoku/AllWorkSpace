package com.hh.dome.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName Car.java
 * @Description TODO
 * @createTime 2020年03月23日 18:01:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String make;
    private int numberOfSeats;

}
