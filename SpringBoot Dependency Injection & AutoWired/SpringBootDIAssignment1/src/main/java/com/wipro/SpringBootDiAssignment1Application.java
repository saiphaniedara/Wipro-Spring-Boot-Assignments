package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.wipro.bean.Laptop;

@SpringBootApplication
public class SpringBootDiAssignment1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDiAssignment1Application.class, args);
		Laptop lap = context.getBean(Laptop.class);
		System.out.println(lap);
	}

}
