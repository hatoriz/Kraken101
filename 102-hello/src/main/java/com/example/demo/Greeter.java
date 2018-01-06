package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class Greeter {

	public static void main(String[] args) {
		SpringApplication.run(Greeter.class, args);
	}

    @RestController
    class GreetingController {

        @CrossOrigin
        @RequestMapping("/hello")
        String Hello() {
            return "Hello from service port number: 20002";
        }

        @CrossOrigin
        @RequestMapping("/goodbye")
        String Goodbye() { return "Goodbye from service port number: 20002 ";}

    }

}
