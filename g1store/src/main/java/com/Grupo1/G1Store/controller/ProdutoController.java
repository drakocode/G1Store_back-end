package com.Grupo1.G1Store.controller;


import com.Grupo1.G1Store.model.Produto;
import com.Grupo1.G1Store.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService produtoService;

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

    @GetMapping("/produto/{id}")
    public ResponseEntity<Produto> buscarDadosDoProduto(@PathVariable("id")Long id){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.buscarDadosDoProdutoPorId(id));
    }

    @PostMapping("/novosProdutos")
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.cadastrarProduto(produto));
    }
}
