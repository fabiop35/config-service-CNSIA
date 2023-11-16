package com.cnsia.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServiceCnsiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceCnsiaApplication.class, args);
	}

}
