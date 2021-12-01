package com.Grupo1.G1Store.repository;

import com.Grupo1.G1Store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
