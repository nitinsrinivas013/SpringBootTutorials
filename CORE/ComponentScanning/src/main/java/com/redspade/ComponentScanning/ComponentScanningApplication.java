package com.redspade.ComponentScanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Explicitly listing the component packages that needs to be scanned
@SpringBootApplication(
		scanBasePackages = {
				"com.redspade.ComponentScanning",
				"com.redspade.util"
		}
)
public class ComponentScanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentScanningApplication.class, args);
	}

}
