package com.restfuljerseyswagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restfuljerseyswagger.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	List<Pessoa> findAll();
}
