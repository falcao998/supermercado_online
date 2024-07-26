package br.souzasystem.domain.request;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.context.annotation.Lazy;

@Getter
@Setter
public class ClientePagamentoRequest {

    private String id;

    @NotNull
    @NotEmpty
    private String numeroCartao;

    @NotNull
    @NotEmpty
    private String nomeCartao;

    private String apelidoCartao;

    @NotNull
    @NotEmpty
    private String validadeCartao;

    @NotNull
    private ClienteRequest cliente;

}
