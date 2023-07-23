package com.bestbanks.servconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class MsBestbankServconfApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBestbankServconfApplication.class, args);
	}

}
