package com.example.apicadastroPessoa.entity.endereco;

import com.example.apicadastroPessoa.entity.pessoa.Pessoa;
import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @Column(name = "cep", nullable = false)
    private Integer cep;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "cidade", nullable = false)
    private String cidade;

    @Column(name = "estado", nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "pessoaId")
    private Pessoa person;
}
