package com.restfuljerseyswagger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(value = "Pessoa")
public class Pessoa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(value = "Id da pessoa.", required=true)
	private Integer idPessoa;
	
	@Column(name="nome", nullable=false)
	@ApiModelProperty(value = "Nome da pessoa.", required=true)
	private String nome;
	
	@Column(name="idade", nullable=false)
	@ApiModelProperty(value = "Idade da pessoa.", required=true)
	private int idade;
	
	
	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
