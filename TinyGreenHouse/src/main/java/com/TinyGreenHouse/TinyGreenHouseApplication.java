package com.TinyGreenHouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.divo")
public class TinyGreenHouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinyGreenHouseApplication.class, args);
	}

}
