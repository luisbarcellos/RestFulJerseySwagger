package com.restfuljerseyswagger.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.restfuljerseyswagger.controller.PessoaController;

@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig(){
		super();
		register(PessoaController.class);
		packages("io.swagger.jaxrs.json");
	    register(io.swagger.jaxrs.listing.ApiListingResource.class);
	    register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
	}
}