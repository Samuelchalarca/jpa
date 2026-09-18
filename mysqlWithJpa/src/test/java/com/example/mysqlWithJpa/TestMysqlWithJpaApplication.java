package com.example.mysqlWithJpa;

import org.springframework.boot.SpringApplication;

public class TestMysqlWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.from(MysqlWithJpaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
