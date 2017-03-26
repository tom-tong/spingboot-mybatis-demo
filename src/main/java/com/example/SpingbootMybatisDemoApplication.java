package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.mapper.PersonMapper;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpingbootMybatisDemoApplication implements CommandLineRunner{

	@Autowired
	private PersonMapper personMapper;

	public static void main(String[] args) {
		SpringApplication.run(SpingbootMybatisDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.personMapper.getById(2));
	}

}
