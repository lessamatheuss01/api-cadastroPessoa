package com.example.apicadastroPessoa.controller.PessoaController.mapper;

import com.example.apicadastroPessoa.controller.EnderecoController.dto.EnderecoResponse;
import com.example.apicadastroPessoa.controller.EnderecoController.mapper.EnderecoMapper;
import com.example.apicadastroPessoa.controller.PessoaController.dto.PessoaRequestDTO;
import com.example.apicadastroPessoa.controller.PessoaController.dto.PessoaResponse;
import com.example.apicadastroPessoa.entity.pessoa.Pessoa;

import java.time.LocalDate;
import java.util.List;

public class PessoaMapper {
    public static Pessoa mapRequestToPessoa(PessoaRequestDTO pessoaRequestDTO){
        Pessoa pessoa = new Pessoa();
        pessoa.setNameCompleto(pessoaRequestDTO.getNomeCompleto());
        pessoa.setDataNascimento(pessoaRequestDTO.getDataNascimento());

        return pessoa;
    }

    public static PessoaResponse mapPessoaToResponse(Pessoa pessoa){
        PessoaResponse pessoaResponse = new PessoaResponse();
        pessoaResponse.setId(pessoa.getId());
        pessoaResponse.setNameCompleto(pessoa.getNameCompleto());
        pessoaResponse.setIdade(LocalDate.now().getYear() - pessoa.getDataNascimento().getYear());

        List<EnderecoResponse> enderecoResponses = pessoa.getEnderecos().stream()
                .map(EnderecoMapper::mapEnderecoToResponse).toList();

        pessoaResponse.setEnderecos(enderecoResponses);

        return pessoaResponse;
    }

}
