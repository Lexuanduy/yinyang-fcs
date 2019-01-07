package com.fcs.yinyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages="com.fcs.yinyang.controller")
@SpringBootApplication
public class YinyangApplication {

	public static void main(String[] args) {
		SpringApplication.run(YinyangApplication.class, args);
	}

}

