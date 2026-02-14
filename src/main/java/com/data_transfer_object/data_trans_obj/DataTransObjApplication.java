package com.data_transfer_object.data_trans_obj;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataTransObjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataTransObjApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
