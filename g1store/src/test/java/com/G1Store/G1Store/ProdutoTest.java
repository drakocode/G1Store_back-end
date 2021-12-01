package com.G1Store.G1Store;

import com.G1Store.G1Store.model.Categoria;
import com.G1Store.G1Store.model.Produto;
import com.G1Store.G1Store.repository.ProdutoRepository;
import com.G1Store.G1Store.service.ProdutoService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdutoTest {



    private static ProdutoRepository produtoRepository=new ProdutoRepository() {
        @Override
        public List<Produto> findAll() {
            return null;
        }

        @Override
        public List<Produto> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<Produto> findAllById(Iterable<Long> longs) {
            return null;
        }

        @Override
        public <S extends Produto> List<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends Produto> S saveAndFlush(S entity) {
            return null;
        }

        @Override
        public <S extends Produto> List<S> saveAllAndFlush(Iterable<S> entities) {
            return null;
        }

        @Override
        public void deleteAllInBatch(Iterable<Produto> entities) {

        }

        @Override
        public void deleteAllByIdInBatch(Iterable<Long> longs) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public Produto getOne(Long aLong) {
            return null;
        }

        @Override
        public Produto getById(Long aLong) {
            return null;
        }

        @Override
        public <S extends Produto> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends Produto> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<Produto> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Produto> S save(S entity) {
            return null;
        }

        @Override
        public Optional<Produto> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(Produto entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Long> longs) {

        }

        @Override
        public void deleteAll(Iterable<? extends Produto> entities) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends Produto> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends Produto> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Produto> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends Produto> boolean exists(Example<S> example) {
            return false;
        }

        @Override
        public <S extends Produto, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
            return null;
        }
    };
    private static ProdutoService produtoService=new ProdutoService();
    @BeforeClass
    public static void cadastrarProdutosECategorias(){


        List<Produto> produtos = new ArrayList<>();
        List<Categoria> categorias = new ArrayList<>();

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
    }


//    @Test
//    public void buscarDadosDoProdutoPorId(){
//        produtoRepository.getById(1L);
//        produtoRepository.getById(2L);
//        produtoRepository.getById(3L);
//        produtoRepository.getById(4L);
//
//        produtoService.buscarDadosDoProdutoPorId(1L);
//        produtoService.buscarDadosDoProdutoPorId(2L);
//        produtoService.buscarDadosDoProdutoPorId(3L);
//        produtoService.buscarDadosDoProdutoPorId(4L);
//    }

    @Test
    public void buscarTodosProdutos(){
        produtoService.buscarTodos();
        System.out.println(produtoService.buscarTodos());
    }
}
