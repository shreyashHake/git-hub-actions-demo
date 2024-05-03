package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;

import static org.mockito.Mockito.*;

public class DemoProjectForGithubActionsApplicationTest {

	@Test
	public void testMain() {
		try (MockedStatic<SpringApplication> mocked = mockStatic(SpringApplication.class)) {
			DemoProjectForGithubActionsApplication.main(new String[]{});
			mocked.verify(() -> SpringApplication.run(DemoProjectForGithubActionsApplication.class, new String[]{}));
		}
	}
}
