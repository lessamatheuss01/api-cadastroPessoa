package com.example.apicadastroPessoa.service;


import com.example.apicadastroPessoa.entity.endereco.Endereco;
import com.example.apicadastroPessoa.entity.pessoa.Pessoa;
import com.example.apicadastroPessoa.exception.EntityException;
import com.example.apicadastroPessoa.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    public Pessoa save(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
    public Pessoa update(Pessoa pessoa, Long id){
        Pessoa pessoaUpdate = getById(id);
        pessoa.setId(pessoaUpdate.getId());
        return pessoaRepository.save(pessoa);
    }

    public Pessoa getById(Long id){
        return pessoaRepository.findById(id).orElseThrow(() -> new EntityException("Pessoa Not Found"));
    }

    public void delete(Long id){
        Pessoa pessoa = getById(id);
        pessoaRepository.delete(pessoa);
    }

}
