package com.example.apicadastroPessoa.controller.EnderecoController.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoResponse {
    private Long id;
    private String logradouro;
    private String cep;
    private Integer numero;
    private String cidade;
    private String estado;
}
