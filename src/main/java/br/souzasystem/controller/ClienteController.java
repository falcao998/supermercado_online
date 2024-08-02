package br.souzasystem.controller;

import br.souzasystem.domain.entity.Cliente;
import br.souzasystem.domain.request.ClienteRequest;
import br.souzasystem.domain.response.ClienteResponse;
import br.souzasystem.repository.ClienteRepository;
import br.souzasystem.utils.SystemEncoder;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    ModelMapper mapper = new ModelMapper();

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClienteResponse> getAllClientes() {
        List<Cliente> clientes = repository.findAll();
        List<ClienteResponse> responses = clientes.stream()
                .map(cliente -> mapper.map(cliente,ClienteResponse.class))
                .toList();
        return responses;
    }

    @GetMapping("search")
    @ResponseStatus(HttpStatus.OK)
    public List<ClienteResponse> searchCliente(@RequestBody ClienteRequest request) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll()
                .withIgnoreCase()
                .withMatcher("nome", GenericPropertyMatchers.contains())
                .withMatcher("documento", GenericPropertyMatchers.contains())
                .withMatcher("telefone", GenericPropertyMatchers.contains())
                .withMatcher("celular", GenericPropertyMatchers.contains())
                .withMatcher("login", GenericPropertyMatchers.contains())
                .withMatcher("email", GenericPropertyMatchers.contains());

        Cliente entity = mapper.map(request, Cliente.class);
        Example<Cliente> example = Example.of(entity, exampleMatcher);

        List<Cliente> clientes = repository.findAll(example);

        List<ClienteResponse> responses = clientes.stream()
                .map(cliente -> mapper.map(cliente,ClienteResponse.class)).toList();

        return responses;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponse salvarCliente(@RequestBody @Valid ClienteRequest request) {
        Cliente cliente = mapper.map(request, Cliente.class);
        try {
            cliente.setSenha(SystemEncoder.passwordEncoder().encode(cliente.getSenha()));
            repository.save(cliente);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return mapper.map(cliente,ClienteResponse.class);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void apagarClientePorId(@PathVariable String id) {

        Optional<Cliente> clienteOptional = repository.findById(id);
        if (clienteOptional.isPresent()) {
            repository.delete(clienteOptional.get());
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CLIENTE COM ID "+id+" NÃO ENCONTRADO");
        }
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void apagarCliente(@org.jetbrains.annotations.NotNull @RequestBody ClienteRequest cliente) {

        Optional<Cliente> clienteOptional = repository.findById(cliente.getId());
        if (clienteOptional.isPresent()) {
            repository.delete(clienteOptional.get());
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CLIENTE COM ID "+cliente.getId()+" NÃO ENCONTRADO");
        }
    }

}
