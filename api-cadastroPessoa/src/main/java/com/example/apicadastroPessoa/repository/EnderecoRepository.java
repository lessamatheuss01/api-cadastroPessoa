package com.example.apicadastroPessoa.repository;

import com.example.apicadastroPessoa.entity.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
