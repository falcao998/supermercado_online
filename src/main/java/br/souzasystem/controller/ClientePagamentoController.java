package br.souzasystem.controller;

import br.souzasystem.domain.entity.ClientePagamento;
import br.souzasystem.domain.request.ClientePagamentoRequest;
import br.souzasystem.domain.response.ClientePagamentoResponse;
import br.souzasystem.repository.ClientePagamentoRepository;
import br.souzasystem.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/clientespagamentos")
public class ClientePagamentoController {

    @Autowired
    private ClientePagamentoRepository clientePagamentoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    private ModelMapper mapper = new ModelMapper();

    @GetMapping
    public List<ClientePagamentoResponse> getAllClientePagamento() {
        List<ClientePagamento> clientePagamentos = clientePagamentoRepository.findAll();

        List<ClientePagamentoResponse> responses = clientePagamentos.stream()
                .map(pagamento -> mapper.map(pagamento, ClientePagamentoResponse.class))
                .toList();

        return responses;
    }

    @PostMapping
    public ClientePagamentoResponse postClientePagamento(@RequestBody @Valid ClientePagamentoRequest request) {

        ClientePagamento clientePagamento = mapper.map(request, ClientePagamento.class);

        clientePagamento = clientePagamentoRepository.save(clientePagamento);

        return mapper.map(clientePagamento, ClientePagamentoResponse.class);
    }
}
