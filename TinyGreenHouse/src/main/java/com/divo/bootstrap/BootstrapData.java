package com.divo.bootstrap;

import org.springframework.boot.CommandLineRunner;

import com.divo.domain.Greenhouse;
import com.divo.repositories.GreenhouseRepository;

public class BootstrapData implements CommandLineRunner {

	private final GreenhouseRepository greenhouseRepository;
	
	public BootstrapData(GreenhouseRepository greenhouseRepository) {
		this.greenhouseRepository = greenhouseRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Greenhouse greenhouse = new Greenhouse("Test GH", 33.34234, 5.342, "my test");
		
		greenhouseRepository.save(greenhouse);
		
		System.out.println("Saving one greenhouse.......................................... ");
	}

}
