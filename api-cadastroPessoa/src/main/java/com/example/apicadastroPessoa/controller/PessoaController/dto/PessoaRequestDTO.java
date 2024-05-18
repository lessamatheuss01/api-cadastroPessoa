package com.example.apicadastroPessoa.controller.PessoaController.dto;

import com.example.apicadastroPessoa.controller.EnderecoController.dto.EnderecoRequestDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class PessoaRequestDTO {
    private Long id;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private List<EnderecoRequestDTO> enderecoDTOS;
}
