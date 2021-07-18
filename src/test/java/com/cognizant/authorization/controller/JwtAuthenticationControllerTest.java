package com.cognizant.authorization.controller;

import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.authentication.AuthenticationManager;

import com.cognizant.authorization.repository.MyUserRepository;
import com.cognizant.authorization.service.CustomerDetailsService;
import com.cognizant.authorization.service.JwtUtil;

@SpringBootTest
class JwtAuthenticationControllerTest {

	@MockBean
	private JwtUtil jwtutil;

	@MockBean
	private CustomerDetailsService custdetailservice;

	@MockBean
	private MyUserRepository userservice;

	@MockBean
	private AuthenticationManager authenticationManager;

	@InjectMocks
	private JwtAuthenticationController controller;

//	@Test
//	void testLogin() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetValidity() {
//		fail("Not yet implemented");
//	}

}
