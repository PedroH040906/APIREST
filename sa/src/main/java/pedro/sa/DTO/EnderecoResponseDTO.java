package pedro.sa.DTO;

import pedro.sa.model.Endereco;

public record EnderecoResponseDTO(String logradouro, String bairro, String numero, String complemento, String cep, String estado) {
    public EnderecoResponseDTO(Endereco endereco) {
       this(endereco.getLogradouro(), endereco.getBairro(), endereco.getNumero(), endereco.getComplemento(), endereco.getCep(), endereco.getEstado());
    }
}
