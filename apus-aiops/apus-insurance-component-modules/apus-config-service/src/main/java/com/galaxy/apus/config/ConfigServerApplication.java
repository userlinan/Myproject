package com.galaxy.apus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer//
@SpringBootApplication//
@EnableDiscoveryClient//使注册中心扫描到该服务(适合于各种注册中心)，@EnableEurekaClient只适用于Eureka作为注册中心
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
