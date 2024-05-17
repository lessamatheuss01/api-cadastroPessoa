package com.example.apicadastroPessoa.entity.pessoa;

import com.example.apicadastroPessoa.entity.endereco.Endereco;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pessoa")
@Getter
@Setter
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_completo", nullable = false)
    private String nameCompleto;

    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Endereco> enderecos = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "endereco")
    private Endereco endereco;
}
