package com.nwpu.um;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nwpu.um.dao")
public class UMApplication {

	public static void main(String[] args) {
		SpringApplication.run(UMApplication.class, args);
	}
}
