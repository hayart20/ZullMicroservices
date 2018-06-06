package am.developer.bikeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BikeApplication {

	@RequestMapping(value = "/")
	public String available() {
		return "Welcome To Bike Service!";
	}

	public static void main(String[] args) {
		SpringApplication.run(BikeApplication.class, args);
	}
}