package br.souzasystem.domain.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteSemListsResponse {

    private String id;

    private String nome;

    private String documento;

    private String telefone;

    private String celular;

    private String login;

    private String senha;

    private String email;
}
