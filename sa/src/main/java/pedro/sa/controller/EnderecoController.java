package pedro.sa.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedro.sa.DTO.endereco.EnderecoResponseDTO;
import pedro.sa.model.Endereco;
import pedro.sa.repository.EnderecoRepository;

import java.util.List;

@RestController
@RequestMapping("endereco")
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoController {

    @Autowired
    private EnderecoRepository repository;

    @PostMapping
    public void EnderecoPost(@RequestBody EnderecoResponseDTO data) {
    Endereco enderecoData = new Endereco(data);
    repository.save(enderecoData);
    return;
    }
    @GetMapping
    public List<EnderecoResponseDTO> gettAll(){

        List<EnderecoResponseDTO> enderecoList = repository.findAll().stream().map(EnderecoResponseDTO::new).toList();
        return enderecoList;
    }
}
