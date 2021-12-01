package com.G1Store.G1Store.model;


import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 255)
    private String nome;

    //constructor
    //
    //
    public Categoria(String nome) {
        this.nome = nome;
    }
}
