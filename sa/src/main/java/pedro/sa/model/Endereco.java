package pedro.sa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pedro.sa.DTO.endereco.endereco.EnderecoResponseDTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEndereco;

    private String logradouro;
    private String bairro;
    private String numero;
    private String complemento;
    private String cep;
    private String estado;

    public Endereco(EnderecoResponseDTO data) {
        this.logradouro = data.logradouro();
        this.bairro = data.bairro();
        this.numero = data.numero();
        this.complemento = data.complemento();
        this.cep = data.cep();
        this.estado = data.estado();
    }

}
