package com.cognizant.authorization;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuthorizationServiceApplicationTests {

	@Test
	public void main2() {

		SpringApplication.run(AuthorizationServiceApplication.class, new String[] {});
	}

	@Test
	public void main() {
		AuthorizationServiceApplication.main(new String[] {});
	}

}
