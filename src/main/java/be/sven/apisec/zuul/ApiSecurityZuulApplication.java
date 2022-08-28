package be.sven.apisec.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ApiSecurityZuulApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(ApiSecurityZuulApplication.class, args);
    }

}
