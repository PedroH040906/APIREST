package pedro.sa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pedro.sa.DTO.pessoa.PessoaRequestDTO;
import pedro.sa.DTO.pessoa.PessoaResponseDTO;
import pedro.sa.DTO.pessoaFisica.PessoaFisicaRequestDTO;
import pedro.sa.DTO.pessoaFisica.PessoaFisicaResponseDTO;
import pedro.sa.DTO.pessoaJuridica.PessoaJuridicaRequestDTO;
import pedro.sa.model.Endereco;
import pedro.sa.model.Pessoa;
import pedro.sa.model.PessoaFisica;
import pedro.sa.model.PessoaJuridica;
import pedro.sa.repository.PessoaRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePessoa(@PathVariable Long id) {
        Optional<Pessoa> pessoaData = pessoaRepository.findById(id);
        if (pessoaData.isPresent()) {
            pessoaRepository.delete(pessoaData.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> updatePessoa(@PathVariable Long id, @RequestBody PessoaRequestDTO data) {
        Optional<Pessoa> existingPessoa = pessoaRepository.findById(id);
        if (existingPessoa.isPresent()) {
            Pessoa pessoaData = existingPessoa.get();
            pessoaData.setNome(data.name());
            pessoaData.setTelefone(data.telefone());
            pessoaData.setObs(data.obs());

            Endereco endereco = new Endereco();
            endereco.setLogradouro(data.endereco().getLogradouro());
            endereco.setNumero(data.endereco().getNumero());
            endereco.setBairro(data.endereco().getBairro());
            endereco.setEstado(data.endereco().getEstado());
            endereco.setCep(data.endereco().getCep());
            endereco.setComplemento(data.endereco().getComplemento());
            pessoaData.setEndereco(endereco);

            pessoaRepository.save(pessoaData);
            return ResponseEntity.ok(pessoaData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}