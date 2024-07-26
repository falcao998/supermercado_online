package br.souzasystem.domain.response;

import br.souzasystem.domain.enums.EnderecoTipo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteEnderecoSemClienteResponse {

    private String id;

    private String rua;

    private String numero;

    private String cep;

    private String complemento;

    private String bairro;

    private String cidade;

    private String estado;

    private EnderecoTipo tipo;
}
