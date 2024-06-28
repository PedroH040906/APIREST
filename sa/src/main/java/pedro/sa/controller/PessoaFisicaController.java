package pedro.sa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedro.sa.DTO.pessoaFisica.PessoaFisicaResponseDTO;
import pedro.sa.model.PessoaFisica;
import pedro.sa.repository.PessoaFisicaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("PessoaFisica")
public class PessoaFisicaController {

    @Autowired
    private PessoaFisicaRepository repository;

    @PostMapping
    public void PessoaFisicaPost(@RequestBody PessoaFisicaResponseDTO data) {
        PessoaFisica pessoaFisicaData = new PessoaFisica(data);
        repository.save(pessoaFisicaData);
        return;
    }
    @GetMapping
    public List<PessoaFisicaResponseDTO> getAll() {
        List<PessoaFisicaResponseDTO> pessoaFisicaList = repository.findAll().stream().map(PessoaFisicaResponseDTO::new).toList();
        return pessoaFisicaList;
    }
    @DeleteMapping("/{id}")
    public void deletePessoaFisica(@PathVariable Long id) {
        Optional<PessoaFisica> pessoaFisicaData = repository.findById(id);
        if (pessoaFisicaData.isPresent()) {
            repository.delete(pessoaFisicaData.get());
        }
    }
    @PutMapping("/{id}")
    public void updatePessoaFisica(@PathVariable Long id, @RequestBody PessoaFisicaResponseDTO data) {
        Optional<PessoaFisica> existingPessoaFisica = repository.findById(id);
        if (existingPessoaFisica.isPresent()) {
            PessoaFisica pessoaFisicaData = existingPessoaFisica.get();
            pessoaFisicaData.setGenero(data.genero());
            pessoaFisicaData.setCpf(data.cpf());
            pessoaFisicaData.setDataNascimento(data.dataNascimento());
            pessoaFisicaData.setGenero(data.genero());
            repository.save(pessoaFisicaData);
        }
    }
}