package com.dinein.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dinein.model.DineInForm;

@Configuration
public class AppConfig {

	@Bean
	public DineInForm dineInForm()
	{
		return new DineInForm();
	}
}
