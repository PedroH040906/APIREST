package pedro.sa.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedro.sa.DTO.PessoaResponseDTO;
import pedro.sa.model.Pessoa;
import pedro.sa.repository.PessoaRepository;

import java.util.List;

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
}
