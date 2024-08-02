package br.souzasystem.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.context.annotation.Lazy;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @UuidGenerator
    @Column(name = "CLIENTE_ID")
    private String id;

    @Column(name = "CLIENTE_NOME", nullable = false)
    private String nome;

    @Column(name = "CLIENTE_DOCUMENTO", nullable = false, unique = true)
    private String documento;

    @Column(name = "CLIENTE_TELEFONE")
    private String telefone;

    @Column(name = "CLIENTE_CELULAR", nullable = false)
    private String celular;

    @Column(name = "CLIENTE_LOGIN", nullable = false, unique = true)
    private String login;

    @Column(name = "CLIENTE_SENHA", nullable = false)
    private String senha;

    @Column(name = "CLIENTE_EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "CLIENTE_ROLE", nullable = false)
    private String role = "CLIENTE";

    @OneToMany(mappedBy = "cliente")
    private List<ClienteEndereco> enderecos;

    @OneToMany(mappedBy = "cliente")
    private List<ClientePagamento> pagamentos;
}
