package am.developer.zuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringBootApplication
public class ZuulGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGateWayApplication.class, args);
	}
}
