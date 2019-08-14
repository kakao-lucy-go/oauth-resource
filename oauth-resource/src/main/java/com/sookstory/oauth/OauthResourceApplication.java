package com.sookstory.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sookstory.oauth.repository")
@EntityScan("com.sookstory.oauth.entity")
public class OauthResourceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OauthResourceApplication.class, args);
	}

}
