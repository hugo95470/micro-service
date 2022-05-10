package com.equi.talkandpokefrontapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class TalkandpokefrontapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalkandpokefrontapiApplication.class, args);
    }

}
