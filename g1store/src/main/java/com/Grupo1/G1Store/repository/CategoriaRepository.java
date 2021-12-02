package com.Grupo1.G1Store.repository;

import com.Grupo1.G1Store.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
//    List<Categoria> buscarTodosProdutos();
}
