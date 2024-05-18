package com.example.apicadastroPessoa.controller.PessoaController.dto;

import com.example.apicadastroPessoa.controller.EnderecoController.dto.EnderecoResponse;
import com.example.apicadastroPessoa.entity.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PessoaResponse {
    private Long id;

    private String nameCompleto;

    private Integer idade;

    private List<EnderecoResponse> enderecos;

}
