package com.example.apicadastroPessoa.controller.EnderecoController.mapper;

import com.example.apicadastroPessoa.controller.EnderecoController.dto.EnderecoRequestDTO;
import com.example.apicadastroPessoa.controller.EnderecoController.dto.EnderecoResponse;
import com.example.apicadastroPessoa.entity.endereco.Endereco;

public class EnderecoMapper {
    public static Endereco mapResquestToEndereco(EnderecoRequestDTO enderecoRequestDTO){
        Endereco endereco = new Endereco();
        endereco.setLogradouro(enderecoRequestDTO.getLogradouro());
        endereco.setCep(enderecoRequestDTO.getCep());
        endereco.setNumero(enderecoRequestDTO.getNumero());
        endereco.setCidade(enderecoRequestDTO.getCidade());
        endereco.setEstado(enderecoRequestDTO.getEstado());

        return endereco;
    }

    public static EnderecoResponse mapEnderecoToResponse(Endereco endereco){
        EnderecoResponse enderecoResponse = new EnderecoResponse();
        enderecoResponse.setId(endereco.getId());
        enderecoResponse.setCep(endereco.getCep());
        enderecoResponse.setNumero(endereco.getNumero());
        enderecoResponse.setLogradouro(endereco.getLogradouro());
        enderecoResponse.setCidade(endereco.getCidade());

        return enderecoResponse;
    }
}
