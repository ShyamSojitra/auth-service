package com.cognizant.authorization.exception;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class UserNotFoundExceptionTest {

	private UserNotFoundException e = new UserNotFoundException("message");

	@Test
	void testMessageSetter() {
		assertThat(e).isNotNull();
	}
}
