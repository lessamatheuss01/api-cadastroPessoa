package com.example.apicadastroPessoa.entity.endereco;

import com.example.apicadastroPessoa.entity.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logradouro;

    private String cep;

    private Integer numero;

    private String cidade;

    private String estado;

    @ManyToOne
    private Pessoa pessoa;
}
