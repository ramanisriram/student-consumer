package com.playtech.studentconsumer;

import com.playtech.studentconsumer.bean.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentConsumerApplication.class, args);
	}

/*	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Student student = restTemplate.getForObject(
					"http://localhost:8080/students/1", Student.class);
			System.out.println(student.getFirstName().toString());
		};
	}*/

}
