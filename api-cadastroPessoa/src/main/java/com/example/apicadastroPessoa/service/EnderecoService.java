package com.example.apicadastroPessoa.service;

import com.example.apicadastroPessoa.entity.endereco.Endereco;
import com.example.apicadastroPessoa.entity.pessoa.Pessoa;
import com.example.apicadastroPessoa.repository.EnderecoRepository;
import com.example.apicadastroPessoa.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;

    public Endereco save(Endereco endereco, Pessoa pessoa){
        endereco.setPessoa(pessoa);
        return enderecoRepository.save(endereco);
    }
}
