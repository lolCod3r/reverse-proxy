package com.example.proxy;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ReverseProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseProxyApplication.class, args);		
	}
	
}
