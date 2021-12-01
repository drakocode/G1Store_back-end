package com.grupo1.g1store.controller;


import com.grupo1.g1store.model.Produto;
import com.grupo1.g1store.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private ProdutoService produtoService;

    //constructor
    //
    //
    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    //methods
    //
    //
    @GetMapping("/produtos")
    public ResponseEntity<List<Produto>> buscarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarDadosDoProduto(Long id){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.buscarDadosDoProdutoPorId(id));
    }
}
