package com.company;

import lombok.Getter;

import java.util.Date;

public class Aircraft {
    private @Getter final String m_manufacturer;
    private @Getter float m_max_speed;
    private @Getter float m_max_altitude;
    private @Getter final Date m_production_date;

    public Aircraft(String m_manufacturer, float m_max_speed, float m_max_altitude) {
        this.m_manufacturer = m_manufacturer;
        this.m_max_speed = m_max_speed;
        this.m_max_altitude = m_max_altitude;
        this.m_production_date = new Date();
    }
}
