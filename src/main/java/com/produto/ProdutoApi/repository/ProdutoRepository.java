package com.produto.ProdutoApi.repository;

import com.produto.ProdutoApi.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	Optional<Produto> findByNameProduct(String nameProduct);
	
}
