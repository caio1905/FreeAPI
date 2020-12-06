package br.com.freepe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.freepe.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{}
