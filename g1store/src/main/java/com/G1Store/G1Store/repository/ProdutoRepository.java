package com.G1Store.G1Store.repository;

import com.G1Store.G1Store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
