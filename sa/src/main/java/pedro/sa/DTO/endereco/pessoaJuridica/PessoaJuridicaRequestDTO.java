package pedro.sa.DTO.endereco.pessoaJuridica;

import pedro.sa.model.Pessoa;

public record PessoaJuridicaRequestDTO(Pessoa pessoa,String cnpj,String nomeFantasia, String tipo, String ie, String im,String ramoAtividade) {
}
