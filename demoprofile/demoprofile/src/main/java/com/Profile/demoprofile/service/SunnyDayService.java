package com.Profile.demoprofile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"sunny", "default"})
public class SunnyDayService implements WheatherService {


    @Override
    public String forecast() {
        return "Today is sunny day!";
    }
}
