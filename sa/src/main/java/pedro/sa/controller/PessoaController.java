package pedro.sa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedro.sa.DTO.pessoa.PessoaRequestDTO;
import pedro.sa.DTO.pessoa.PessoaResponseDTO;
import pedro.sa.model.Pessoa;
import pedro.sa.repository.PessoaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public void PessoaPost(@RequestBody PessoaResponseDTO data){
    Pessoa pessoaData = new Pessoa(data);
    repository.save(pessoaData);
    return;
    }
    @GetMapping
    public List<PessoaResponseDTO> getAll() {
        List<PessoaResponseDTO> pessoaList = repository.findAll().stream().map(PessoaResponseDTO::new).toList();
        return pessoaList;
    }
    @DeleteMapping("/{id}")
    public void deletePessoa(@PathVariable Long id) {
        Optional<Pessoa> pessoaData = repository.findById(id);
        if (pessoaData.isPresent()) {
            repository.delete(pessoaData.get());
        }
    }
    @PutMapping("/{id}")
    public void updatePessoa(@PathVariable Long id, @RequestBody PessoaRequestDTO data) {
        Optional<Pessoa> existingPessoa = repository.findById(id);
        if (existingPessoa.isPresent()) {
            Pessoa pessoaData = existingPessoa.get();
            pessoaData.setNome(data.name());
            pessoaData.setTipo(data.tipo());
            pessoaData.setTelefone(data.telefone());
            pessoaData.setObs(data.obs());
            pessoaData.setEndereco(data.endereco());
            repository.save(pessoaData);
        }
    }
}
