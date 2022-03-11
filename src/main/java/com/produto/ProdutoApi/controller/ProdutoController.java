package com.produto.ProdutoApi.controller;

import com.produto.ProdutoApi.entities.Produto;
import com.produto.ProdutoApi.repository.ProdutoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getByName(@PathVariable("name") String name) {

        return ResponseEntity.ok(repository.findByNameProduct(name));
    }

    @PatchMapping("/{name}/{color}")
    public ResponseEntity<?> update(@PathVariable("name") String name, @PathVariable("color") String color) {
        var produtoToUpdate = repository.findByNameProduct(name).get();
        produtoToUpdate.setColor(color);
        repository.save(produtoToUpdate);

        return ResponseEntity.ok(repository.findByNameProduct(name));
    }
}
