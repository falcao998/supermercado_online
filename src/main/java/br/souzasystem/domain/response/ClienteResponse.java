package br.souzasystem.domain.response;

import lombok.*;
import java.util.List;

@Getter
@Setter
public class ClienteResponse extends ClienteSemListsResponse {

    private List<ClienteEnderecoSemClienteResponse> enderecos;

    private List<ClientePagamentoSemClienteResponse> pagamentos;
}
