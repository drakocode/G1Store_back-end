package com.Grupo1.G1Store;

import com.Grupo1.G1Store.model.Categoria;
import com.Grupo1.G1Store.model.Produto;
import com.Grupo1.G1Store.service.CategoriaService;
import com.Grupo1.G1Store.service.ProdutoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class G1StoreApplication {
	public G1StoreApplication() {
	}
	private static ProdutoService produtoService;
	private static CategoriaService categoriaService;

	public G1StoreApplication(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	public G1StoreApplication(CategoriaService categoriaService) {
		this.categoriaService=categoriaService;
	}

	static List<Produto> produtos = new ArrayList<>();
	static List<Categoria> categorias = new ArrayList<>();


	public static void main(String[] args) {
		SpringApplication.run(G1StoreApplication.class, args);
		//
		Categoria nuclear=new Categoria("Nuclear");
		Categoria isotopo=new Categoria("Isotopo");



		Produto p0=new Produto("uranio", 5555.0,"uranio enriquecido com alta volatilidade","img",nuclear);

		Produto p1=new Produto("protio", 5555.0,"uranio enriquecido com alta volatilidade","img",isotopo);
		Produto p2=new Produto("tritio", 5555.0,"uranio enriquecido com alta volatilidade","img",isotopo);
		Produto p3=new Produto("deuterio", 5555.0,"uranio enriquecido com alta volatilidade","img",isotopo);








		categorias.add(nuclear);
		categorias.add(isotopo);

		produtos.add(p0);
		produtos.add(p1);
		produtos.add(p2);

//		produtoService.buscarDadosDoProdutoPorId(1L);
		produtoService.cadastrarProduto(p0);
		produtoService.cadastrarProduto(p1);
		produtoService.cadastrarProduto(p2);
		produtoService.cadastrarProduto(p3);

		categoriaService.cadastrarNovaCategoria(nuclear);
		categoriaService.cadastrarNovaCategoria(isotopo);

	}



}
