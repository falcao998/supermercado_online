package br.souzasystem.domain.response;

import br.souzasystem.domain.enums.EnderecoTipo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteEnderecoResponse extends ClienteEnderecoSemClienteResponse {

    private ClienteSemListsResponse cliente;
}
