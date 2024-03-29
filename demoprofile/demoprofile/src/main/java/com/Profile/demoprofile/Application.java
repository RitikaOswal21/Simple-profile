package com.Profile.demoprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Profile.demoprofile.service.WheatherService;
@SpringBootApplication

public class Application implements CommandLineRunner {

	  @Autowired
	    private WheatherService wheatherService;

	    public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }

	    @Override
	    public void run(String... args) {
	        System.out.println(wheatherService.forecast());
	    }
}
