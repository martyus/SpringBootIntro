package com.example.IntroBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {


    private int revs = 200;

    @Value("BMW")
    private String model;

    private int speed =  40;

    GearBox gb;

    @Override
    public String toString() {
        return "Engine{" +
                "revs=" + revs +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", gb=" + gb.getGear()+
                '}';
    }

    @Autowired
    public Engine(GearBox gb){
        this.gb = gb;
    }

    public void setRevs(int revs) {
        this.revs = revs;
    }

    public int getRevs() {
        return revs;
    }
}
