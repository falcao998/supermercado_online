package br.souzasystem.domain.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientePagamentoSemClienteResponse {

    private String id;

    private String numeroCartao;

    private String nomeCartao;

    private String apelidoCartao;

    private String validadeCartao;
}
