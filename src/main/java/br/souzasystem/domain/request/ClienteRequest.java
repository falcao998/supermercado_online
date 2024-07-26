package br.souzasystem.domain.request;

import jakarta.annotation.PostConstruct;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
public class ClienteRequest {

    private String id;

    @NotNull
    @NotEmpty
    private String nome;

    @NotNull
    @CPF
    private String documento;

    private String telefone;

    @NotNull
    @NotEmpty
    private String celular;

    @NotNull
    @NotEmpty
    private String login;

    @NotNull
    @NotEmpty
    private String senha;

    @NotNull
    @Email
    @NotEmpty
    private String email;

    private List<ClienteEnderecoRequest> enderecos;

    private List<ClientePagamentoRequest> pagamentos;

}
