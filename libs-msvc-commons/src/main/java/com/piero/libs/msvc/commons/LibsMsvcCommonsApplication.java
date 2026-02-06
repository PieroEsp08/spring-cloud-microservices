package com.piero.libs.msvc.commons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class LibsMsvcCommonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibsMsvcCommonsApplication.class, args);
	}

}
