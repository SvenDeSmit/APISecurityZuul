package be.sven.apisec.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableZuulProxy
//@EnableResourceServer
@EnableDiscoveryClient
@SpringBootApplication
public class ApiSecurityZuulApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(ApiSecurityZuulApplication.class, args);
    }

}
