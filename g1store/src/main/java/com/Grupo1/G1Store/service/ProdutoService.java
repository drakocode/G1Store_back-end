package com.Grupo1.G1Store.service;

import com.Grupo1.G1Store.model.Produto;
import com.Grupo1.G1Store.repository.ProdutoRepository;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
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
        //precisa desse .get() n sei exatamente pq
        return produtoRepository.findById(id).get();
    }

    public Produto cadastrarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

//    //sei la oq to fazendo
//    //
//    //
//    public List<Produto> listarUltimosProdutosCadastrados(List produtos){
//
//        if (produtos != null && !produtos.isEmpty()) {
//            Produto produto = (Produto) produtos.get(produtos.size()-1);
//        }
////        return (List<Produto>) produtos.get(produtos.size()-1);
//        return (List<Produto>) Lists.reverse(produtos).get(0);
//    }
//
//    public List<Produto> mostrarProdutoAleatorio(List produtos){
//        Random rand = new Random();
//        return (List<Produto>) produtos.get(rand.nextInt(produtos.size()));
//    }
}
