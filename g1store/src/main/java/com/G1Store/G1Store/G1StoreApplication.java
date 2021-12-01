package com.G1Store.G1Store;

import com.G1Store.G1Store.model.Categoria;
import com.G1Store.G1Store.model.Produto;
import com.G1Store.G1Store.service.ProdutoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class G1StoreApplication {
	private static ProdutoService produtoService;

	public G1StoreApplication(ProdutoService produtoService) {
		this.produtoService = produtoService;
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

		produtoService.buscarDadosDoProdutoPorId(1L);
	}


}
