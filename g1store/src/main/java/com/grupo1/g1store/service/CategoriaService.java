package com.grupo1.g1store.service;

import com.grupo1.g1store.model.Categoria;
import com.grupo1.g1store.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //constructor
    //
    //
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    //methods
    //
    //
    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    }

    public List<Categoria> buscarTodosProdutosDaCategoria(Categoria categoria){
        return categoriaRepository.buscarTodosProdutos();
    }
}
