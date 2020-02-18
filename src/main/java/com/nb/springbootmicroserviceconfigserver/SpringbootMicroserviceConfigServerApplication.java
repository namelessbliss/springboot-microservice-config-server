package com.nb.springbootmicroserviceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringbootMicroserviceConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMicroserviceConfigServerApplication.class, args);
    }

}
