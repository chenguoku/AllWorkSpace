package com.hh.dome.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName CarDto.java
 * @Description TODO
 * @createTime 2020年03月23日 18:00:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {

    private String make;
    private int seatCount;
}
