package com.example.apicadastroPessoa.repository;

import com.example.apicadastroPessoa.entity.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
