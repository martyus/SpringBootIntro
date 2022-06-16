package com.example.IntroBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GearBox {


    private int gear = 3;

    public int getGear() {
        return gear;
    }
}
