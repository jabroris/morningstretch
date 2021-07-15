package com.divo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.divo.domain.Greenhouse;
import com.divo.repositories.GreenhouseRepository;

//@Component
public class BootstrapData  {

	private final GreenhouseRepository greenhouseRepository;
	
	public BootstrapData(GreenhouseRepository greenhouseRepository) {
		this.greenhouseRepository = greenhouseRepository;
	}
	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Greenhouse greenhouse = new Greenhouse("Test GH", "33.34234", "5.342", "my test");
//		greenhouseRepository.deleteAll();
//		greenhouseRepository.save(greenhouse);
//		
//		System.out.println("Saving one greenhouse.......................................... ");
//	}

}
