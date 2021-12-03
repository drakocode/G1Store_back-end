package com.Grupo1.G1Store.service;

import com.Grupo1.G1Store.model.Categoria;
import com.Grupo1.G1Store.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    private CategoriaService categoriaService;
    //constructor
    //
    //

    public CategoriaService() {
    }

    public CategoriaService(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
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

//    public List<Produto> buscarTodosProdutosDaCategoria(Categoria categoria){
//
//
//
//        return List<Produto> produtos.findAll().stream()
//                .filter(produto -> produto.getCategoria().equals(categoria))
//                .collect(Collectors.toList());
//    }

    public void cadastrarNovaCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
    }

}
