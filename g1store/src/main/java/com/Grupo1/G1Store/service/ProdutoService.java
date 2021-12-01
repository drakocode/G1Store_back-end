package com.Grupo1.G1Store.service;

import com.Grupo1.G1Store.model.Produto;
import com.Grupo1.G1Store.repository.ProdutoRepository;
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

    public ProdutoService() {

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

    public Produto cadastrarProduto(Produto produto){
        return produtoRepository.save(produto);
    }
}
