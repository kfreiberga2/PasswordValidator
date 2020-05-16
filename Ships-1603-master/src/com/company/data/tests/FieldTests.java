package com.company.data.tests;

import com.company.data.AddShipResultEnum;
import com.company.data.Field;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FieldTests {
    @Test
    public void addShip_returns_ship_is_null(){
        Field field = new Field(true);
        var result = field.addShip(null);

        Assertions.assertTrue(result == AddShipResultEnum.SHIP_IS_NULL);
    }
}
