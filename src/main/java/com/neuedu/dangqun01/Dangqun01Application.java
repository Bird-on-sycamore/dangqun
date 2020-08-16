package com.neuedu.dangqun01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.neuedu.dangqun01.dao")
public class Dangqun01Application {

	public static void main(String[] args) {
		SpringApplication.run(Dangqun01Application.class, args);
	}

}
