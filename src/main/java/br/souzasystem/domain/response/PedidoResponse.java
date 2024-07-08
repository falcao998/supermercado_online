package br.souzasystem.domain.response;

import br.souzasystem.domain.enums.PedidoFormaPagamento;
import br.souzasystem.domain.enums.PedidoStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class PedidoResponse {

    private String id;

    private String numero;

    private LocalDateTime dataAbertura;

    private LocalDateTime dataFechamento;

    private LocalDateTime dataEntrega;

    private LocalDateTime dataPagamento;

    private BigDecimal valorProduto = BigDecimal.ZERO;

    private BigDecimal valorFrete = BigDecimal.ZERO;

    private BigDecimal valorTotal = BigDecimal.ZERO;

    private PedidoStatus status = PedidoStatus.ABERTO;

    private ClienteResponse cliente;

    private ClienteEnderecoResponse endereco;

    private PedidoFormaPagamento formaPagamento;

    private ClientePagamentoResponse clientePagamento;

    List<PedidoProdutoResponse> pedidoProdutos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    public ClienteResponse getCliente() {
        return cliente;
    }

    public void setCliente(ClienteResponse cliente) {
        this.cliente = cliente;
    }

    public ClienteEnderecoResponse getEndereco() {
        return endereco;
    }

    public void setEndereco(ClienteEnderecoResponse endereco) {
        this.endereco = endereco;
    }

    public PedidoFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(PedidoFormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ClientePagamentoResponse getClientePagamento() {
        return clientePagamento;
    }

    public void setClientePagamento(ClientePagamentoResponse clientePagamento) {
        this.clientePagamento = clientePagamento;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public List<PedidoProdutoResponse> getPedidoProdutos() {
        return pedidoProdutos;
    }

    public void setPedidoProdutos(List<PedidoProdutoResponse> pedidoProdutos) {
        this.pedidoProdutos = pedidoProdutos;
    }
}
