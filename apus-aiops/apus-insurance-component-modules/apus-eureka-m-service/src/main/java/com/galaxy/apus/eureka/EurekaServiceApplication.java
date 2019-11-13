package com.galaxy.apus.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.EmbeddedValueResolverAware;
/**
 * 
 * @author 蚂蚁
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {
	/**
	 * 启动类
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}

}
