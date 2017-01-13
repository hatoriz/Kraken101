package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HatorizApplication {

	public static void main(String[] args) {
		SpringApplication.run(HatorizApplication.class, args);
	}

    ///------------------------------------------------------------
    @RestController
    class GreetingController{
        @RequestMapping("/")
        Greet greet(){
            return new Greet("Hello World!");
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

}
