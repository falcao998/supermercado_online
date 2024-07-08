package br.souzasystem.domain.request;

import java.math.BigDecimal;

public class PedidoProdutoRequest {

    private String id;

    private String numero;

    private Integer quantidade;

    private BigDecimal valorUnitario;

    private BigDecimal valorTotal;

    private ProdutoRequest produto;

    private PedidoRequest pedido;

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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ProdutoRequest getProduto() {
        return produto;
    }

    public void setProduto(ProdutoRequest produto) {
        this.produto = produto;
    }

    public PedidoRequest getPedido() {
        return pedido;
    }

    public void setPedido(PedidoRequest pedido) {
        this.pedido = pedido;
    }
}
