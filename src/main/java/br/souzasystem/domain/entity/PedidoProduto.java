package br.souzasystem.domain.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_PEDIDO_PRODUTO",
       uniqueConstraints = {@UniqueConstraint(name = "UniquePedidoAndProduto", columnNames = {"pedido", "produto"})} )
public class PedidoProduto {

    @Id
    @UuidGenerator
    @Column(name = "PEDIDO_PRODUTO_ID")
    private String id;

    @Column(name = "PEDIDO_PRODUTO_NUMERO", nullable = false)
    private String numero;

    @Column(name = "PEDIDO_PRODUTO_QUANTIDADE", nullable = false)
    private Integer quantidade;

    @Column(name = "PEDIDO_PRODUTO_VALOR_UNITARIO", nullable = false)
    private BigDecimal valorUnitario;

    @Column(name = "PEDIDO_PRODUTO_VALOR_TOTAL", nullable = false)
    private BigDecimal valorTotal;

    @OneToOne
    @JoinColumn(name = "PRODUTO_ID")
    private Produto produto;

    @OneToOne
    @JoinColumn(name = "PEDIDO_ID")
    private Pedido pedido;

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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
