package com.company;

public class Drone  extends Helicopter {
    public Drone(String m_manufacturer, float m_max_speed, float m_max_altitude) {
        super(m_manufacturer, m_max_speed, m_max_altitude);

    }
    public void takeOff(){
        System.out.println("drone is taking off");
    }
}
