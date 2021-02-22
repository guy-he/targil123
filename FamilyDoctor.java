package com.company;

import lombok.Getter;
import lombok.Setter;

public class FamilyDoctor {
    private @Getter @Setter boolean m_is_occupied;
    private @Getter String clinic;

    public void acceptClient(){
        if (m_is_occupied = true){
            System.out.println("the doc is busy");
        }
        else {
            m_is_occupied = true;
            System.out.println("welcome");
        }
    }
    public void finishApointment(){
        m_is_occupied = true;
    }
}
