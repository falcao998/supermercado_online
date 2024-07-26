package br.souzasystem.domain.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientePagamentoResponse extends ClientePagamentoSemClienteResponse {

    private ClienteSemListsResponse cliente;
}
