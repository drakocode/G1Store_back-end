package com.Grupo1.G1Store.service;

import com.Grupo1.G1Store.model.Categoria;
import com.Grupo1.G1Store.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //constructor
    //
    //

    public CategoriaService() {
    }

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

    public Categoria cadastrarNovaCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
