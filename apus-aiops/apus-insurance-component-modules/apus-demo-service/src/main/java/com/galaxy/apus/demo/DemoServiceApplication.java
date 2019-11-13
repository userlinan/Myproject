package com.galaxy.apus.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.EmbeddedValueResolverAware;
/**
 * 
 * @author linannnan
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//客户端
public class DemoServiceApplication {
	/**
	 * 启动类
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}

}
