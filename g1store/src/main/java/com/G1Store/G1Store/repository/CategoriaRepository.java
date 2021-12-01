package com.G1Store.G1Store.repository;

import com.G1Store.G1Store.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> buscarTodosProdutos();
}
