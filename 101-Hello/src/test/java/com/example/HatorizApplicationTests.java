package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.*;
import org.springframework.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HatorizApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testVanillaService() {
//		RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject("http://localhost:8080", String.class);
//        Assert.isTrue(result.equals("hello"));
//		Greet greet = restTemplate.getForObject("http://localhost:8080", Greet.class);
//		Assert.isTrue(greet.getMessage().toString().equals("Hello World!"));
	}

//	@Test
//	public void testSecureService() {
//		String plainCreds = "guest:guest123";
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Authorization", "Basic " + new String(Base64.encode(plainCreds.getBytes())));
//		HttpEntity<String> request = new HttpEntity<String>(headers);
//		RestTemplate restTemplate = new RestTemplate();
//
//		ResponseEntity<Greet> response = restTemplate.exchange("http://localhost:8080", HttpMethod.GET, request, Greet.class);
//		Assert.assertEquals("Hello World!", response.getBody().getMessage());
//	}

}
