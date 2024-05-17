package com.example.apicadastroPessoa.entity.endereco.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoDTO {
    private Long id;
    private String logradouro;
    private Integer cep;
    private Integer numero;
    private String cidade;
    private String estado;
}
