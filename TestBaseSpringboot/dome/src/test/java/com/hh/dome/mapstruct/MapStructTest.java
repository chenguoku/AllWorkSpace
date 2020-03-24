package com.hh.dome.mapstruct;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName MapStructTest.java
 * @Description TODO
 * @createTime 2020年03月23日 18:39:00
 */
@SpringBootTest
public class MapStructTest {
//
//    @Autowired
//    private CarMapper carMapper;

    @Test
    public void shouldMapCarToDto() {
        //given
        Car car = new Car( "Morris", 5 );

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );
//        CarDto carDto = carMapper.carToCarDto(car);
        //then
        System.out.println(carDto);
    }
}
