package com.restfuljerseyswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.jaxrs.config.BeanConfig;

@Configuration
public class SwaggerConfiguration {
  @Bean
  public BeanConfig beanConfig(){
	  BeanConfig beanConfig = new BeanConfig();
	  beanConfig.setTitle("Título");
	  beanConfig.setVersion("v1");
	  beanConfig.setBasePath("/");
	  beanConfig.setResourcePackage("com.restfuljerseyswagger.controller");
	  beanConfig.setScan(true);
	  
	  return beanConfig;
  }
}