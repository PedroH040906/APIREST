package pedro.sa.DTO.endereco;

import pedro.sa.model.Endereco;

public record EnderecoResponseDTO(Long idEndereco,String logradouro, String bairro, String numero, String complemento, String cep, String estado) {
    public EnderecoResponseDTO(Endereco endereco) {
       this(endereco.getIdEndereco(), endereco.getLogradouro(), endereco.getBairro(), endereco.getNumero(), endereco.getComplemento(), endereco.getCep(), endereco.getEstado());
    }
}
