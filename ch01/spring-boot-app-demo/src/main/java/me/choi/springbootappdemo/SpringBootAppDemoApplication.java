package me.choi.springbootappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication springApplication =
			new SpringApplication(SpringBootAppDemoApplication.class);

		springApplication.setWebApplicationType(WebApplicationType.REACTIVE);
		springApplication.run(args);
	}

}
