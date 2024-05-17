package com.example.apicadastroPessoa.service;


import com.example.apicadastroPessoa.entity.pessoa.Pessoa;
import com.example.apicadastroPessoa.entity.pessoa.dto.PessoaDTO;
import com.example.apicadastroPessoa.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaDTO save(PessoaDTO pessoaDTO){
        Pessoa pessoa = new Pessoa();
        pessoa.setNameCompleto(pessoaDTO.getNomeCompleto());
        pessoa.setDataNascimento(pessoaDTO.getDataNascimento());
        pessoa.setEnderecos(pessoaDTO.getEnderecoDTOS().stream()
                .map(this::c));
    }
}
