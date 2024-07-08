package br.souzasystem.controller;

import br.souzasystem.domain.entity.ClientePagamento;
import br.souzasystem.domain.mapper.ClientePagamentoMapper;
import br.souzasystem.domain.response.ClientePagamentoResponse;
import br.souzasystem.repository.ClientePagamentoRepository;
import br.souzasystem.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/clientespagamentos")
public class ClientePagamentoController {

    @Autowired
    private ClientePagamentoRepository clientePagamentoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<ClientePagamentoResponse> getAllClientePagamento() {
        List<ClientePagamento> clientePagamentos = clientePagamentoRepository.findAll();

        List<ClientePagamentoResponse> responses = clientePagamentos.stream()
                .map(ClientePagamentoMapper.INSTANCE::entityToResponse)
                .toList();

        return responses;
    }
}
