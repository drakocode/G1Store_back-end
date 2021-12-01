package com.grupo1.g1store.repository;

import com.grupo1.g1store.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
