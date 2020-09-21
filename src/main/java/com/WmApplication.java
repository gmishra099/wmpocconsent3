package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.wm"})
public class WmApplication {

	public static void main(String[] args) {
		SpringApplication.run(WmApplication.class, args);
	}

}
