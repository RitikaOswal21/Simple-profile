package com.Profile.demoprofile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("raining")
public class RainyDayService implements WheatherService{


    @Override
    public String forecast() {
        return "Today is raining day!";
    }
}
