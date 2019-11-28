package com.galaxy.apus.ribbin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author 蚂蚁
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbinServiceApplication {
	/**
	 * 启动类
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(RibbinServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
	return new RestTemplate();}
}
	


