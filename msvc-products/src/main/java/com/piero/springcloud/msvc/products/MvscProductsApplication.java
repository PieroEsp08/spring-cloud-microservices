package com.piero.springcloud.msvc.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.piero.libs.msvc.commons.entities","com.piero.springcloud.msvc.products.entities"})
public class MvscProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvscProductsApplication.class, args);
	}

}
