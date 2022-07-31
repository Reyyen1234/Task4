package com.reyyencuneyt.task4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
public class Task4Application {


	public static void main(String[] args) {

		System.setProperty("spring.devtools.restart.enabled","true");
		System.setProperty("java.awt.headless", "false"); //Disables headless
		SpringApplication.run(Task4Application.class, args);
	}

}
