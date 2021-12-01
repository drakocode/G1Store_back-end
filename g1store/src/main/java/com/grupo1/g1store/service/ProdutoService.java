package com.grupo1.g1store.service;

import com.grupo1.g1store.model.Produto;
import com.grupo1.g1store.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    //constructor
    //
    //
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    //methods
    //
    //
    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }

    public Produto buscarDadosDoProdutoPorId(Long id){
        return produtoRepository.getById(id);
    }
}
