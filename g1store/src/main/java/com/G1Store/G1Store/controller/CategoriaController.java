package com.G1Store.G1Store.controller;

import com.G1Store.G1Store.model.Categoria;
import com.G1Store.G1Store.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private CategoriaService categoriaService;

    //constructor
    //
    //
    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    //methods
    //
    //
    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> buscarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.buscarTodos());
    }

    @GetMapping("/categorias/produto")
    public ResponseEntity<List<Categoria>> buscarTodosProdutosDaCategoria(Categoria categoria){
        return  ResponseEntity.status(HttpStatus.OK).body(categoriaService.buscarTodosProdutosDaCategoria(categoria));
    }
}
