package com.example.apicadastroPessoa.entity.pessoa.dto;

import com.example.apicadastroPessoa.entity.endereco.dto.EnderecoDTO;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class PessoaDTO {
    private Long id;
    private String nomeCompleto;
    private Date dataNascimento;
    private List<EnderecoDTO> enderecoDTOS;
}
