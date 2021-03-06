package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// simple auth
//import org.springframework.security.config.annotation.method.configuration.*;
// oauth

// Simple auth
//@EnableGlobalMethodSecurity

// Oauth
@EnableResourceServer
@EnableAuthorizationServer

// Auto spring boot app
@SpringBootApplication
public class HatorizApplication {

	public static void main(String[] args) {
		SpringApplication.run(HatorizApplication.class, args);
	}

    @Autowired
    Environment env;

    ///------------------------------------------------------------
    @RestController
    class GreetingController{
        @CrossOrigin
        @RequestMapping("/")
        String Hello(){
            //return "Hello from " + env.getProperty("bootrest.customerproperty");
            return "Hello this is hatoriz";
        }

//        Greet greet(){
//            return new Greet("Hello World!");
//        }
    }
}

class Greet {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public Greet() {}

    public Greet(String message) {
        this.message = message;
    }

}


