package pedro.sa.DTO.pessoaJuridica;

import pedro.sa.model.Pessoa;
import pedro.sa.model.PessoaJuridica;

public record PessoaJuridicaResponseDTO(Long idPessoaJuridica, Pessoa pessoa,String cnpj,String tipo,String ie,String im,String ramoAtividade) {
    public PessoaJuridicaResponseDTO(PessoaJuridica pessoaJuridica) {
        this(pessoaJuridica.getIdPessoaJuridica(), pessoaJuridica.getPessoa(),pessoaJuridica.getCnpj(),pessoaJuridica.getTipo(),pessoaJuridica.getIe(),pessoaJuridica.getIm(),pessoaJuridica.getRamoAtividade());
    }
}
