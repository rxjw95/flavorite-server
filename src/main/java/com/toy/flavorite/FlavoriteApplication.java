package com.toy.flavorite;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class FlavoriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlavoriteApplication.class, args);
	}

}
