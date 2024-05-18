package com.example.apicadastroPessoa.controller.PessoaController;

import com.example.apicadastroPessoa.controller.EnderecoController.mapper.EnderecoMapper;
import com.example.apicadastroPessoa.controller.PessoaController.dto.PessoaRequestDTO;
import com.example.apicadastroPessoa.controller.PessoaController.dto.PessoaResponse;
import com.example.apicadastroPessoa.controller.PessoaController.mapper.PessoaMapper;
import com.example.apicadastroPessoa.entity.endereco.Endereco;
import com.example.apicadastroPessoa.entity.pessoa.Pessoa;
import com.example.apicadastroPessoa.service.EnderecoService;
import com.example.apicadastroPessoa.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
@RequiredArgsConstructor
public class PessoaController {
    private final PessoaService pessoaService;
    private final EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<PessoaResponse> save(@RequestBody PessoaRequestDTO pessoaRequestDTO) {
        Pessoa pessoaSave = pessoaService.save(PessoaMapper.mapRequestToPessoa(pessoaRequestDTO));

        List<Endereco> enderecoSave = pessoaRequestDTO.getEnderecoDTOS().stream()
                .map(EnderecoMapper::mapResquestToEndereco)
                .map(endereco -> enderecoService.save(endereco, pessoaSave))
                .toList();

        PessoaResponse pessoaResponse = PessoaMapper.mapPessoaToResponse(pessoaSave);
        pessoaResponse.setEnderecos(enderecoSave.stream()
                .map(EnderecoMapper::mapEnderecoToResponse)
                .toList());

        return ResponseEntity.ok(pessoaResponse);
    }


    @PutMapping("/{id}")
    public ResponseEntity<PessoaResponse> update(@RequestBody PessoaRequestDTO pessoaRequestDTO, @PathVariable Long id){
        Pessoa pessoaUpdate = pessoaService.update(PessoaMapper.mapRequestToPessoa(pessoaRequestDTO),id);
        return ResponseEntity.ok(PessoaMapper.mapPessoaToResponse(pessoaUpdate));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponse> getById(@PathVariable Long id){
        Pessoa pessoa = pessoaService.getById(id);
        return ResponseEntity.ok(PessoaMapper.mapPessoaToResponse(pessoa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        pessoaService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
