package com.company;

import lombok.Getter;

public class Helicopter extends Aircraft {
    private @Getter String m_engine_power;
    public Helicopter(String m_manufacturer, float m_max_speed, float m_max_altitude) {
        super(m_manufacturer, m_max_speed, m_max_altitude);
        this.m_engine_power = m_engine_power;
    }
}
