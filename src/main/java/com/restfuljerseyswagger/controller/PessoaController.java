package com.restfuljerseyswagger.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.restfuljerseyswagger.entity.Pessoa;
import com.restfuljerseyswagger.repository.PessoaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "pessoas")
@Path("/pessoas")
public class PessoaController {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@ApiOperation(value = "Lista pessoas da base de dados")
	@GET
	@Path("/listarPessoas")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Pessoa> listaPessoas(){
		return pessoaRepository.findAll();
    }
	
	@ApiOperation(value = "Lista pessoas da base de dados filtrador por ID")
	@GET
	@Path("/listarPessoasPorId")
    @Produces(MediaType.APPLICATION_JSON)
	public Response listaPessoasPorID(@QueryParam("idPessoa") Integer idPessoa){
		List<Pessoa> listaPessoas = pessoaRepository.findAll();
		
		return Response.ok(listaPessoas).build();
    }  
}
