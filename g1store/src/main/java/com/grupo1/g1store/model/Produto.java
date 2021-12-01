package com.grupo1.g1store.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 255)
    private String nome;

    @Size(min = 1)
    private Double preco;

    @Size(min = 3, max = 255)
    private String descricao;

    @Size(min = 3, max = 255)
    private String image;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    //constructor
    //
    //
    public Produto(String nome, Double preco, String descricao, String image, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.image = image;
        this.categoria = categoria;
    }


    //getters&setters
    //
    //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
