package com.Profile.demoprofile;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import com.Profile.demoprofile.service.WheatherService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("raining")
public class Testwheatherservice {

	  @Autowired
	    WheatherService weatherService;

	    @Test
	    public void testRainingProfile() {
	        String output = weatherService.forecast();
	        assertThat(output).contains("Today is raining day!");
	    }
}
