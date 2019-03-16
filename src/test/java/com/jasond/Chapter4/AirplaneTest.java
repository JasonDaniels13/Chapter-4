package com.jasond.Chapter4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirplaneTest {


    @Test
    public void given_a_vehicleObject_is_passed_to_weather_wiper_will_activate() {
        Weather w = new Weather();
        Airplane a = new Airplane();
        w.rain(a);
        Assert.assertNotNull(a);
    }

}