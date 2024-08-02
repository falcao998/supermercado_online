package br.souzasystem.service;

import br.souzasystem.domain.entity.Cliente;
import br.souzasystem.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Cliente cliente = repository.findByLogin(username).orElseThrow(
                () -> new UsernameNotFoundException("Cliente não encontrado na base de dados."));

        return User
                .builder()
                .username(cliente.getLogin())
                .password(cliente.getSenha())
                .roles(cliente.getRole())
                .build();
    }
}
