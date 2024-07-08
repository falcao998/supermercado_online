package br.souzasystem.domain.entity;

import br.souzasystem.annotations.GeradorSequencialPedido;
import br.souzasystem.annotations.GeradorSequencialPedidoListener;
import br.souzasystem.domain.enums.PedidoFormaPagamento;
import br.souzasystem.domain.enums.PedidoStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TB_PEDIDO")
@EntityListeners(GeradorSequencialPedidoListener.class)
public class Pedido {

    @Id
    @UuidGenerator
    @Column(name = "PEDIDO_ID")
    private String id;

    @Column(name = "PEDIDO_NUMERO", nullable = false, unique = true)
    @GeradorSequencialPedido
    private String numero;

    @Column(name = "PEDIDO_DATA_ABERTURA", nullable = false)
    private LocalDateTime dataAbertura;

    @Column(name = "PEDIDO_DATA_FECHAMENTO")
    private LocalDateTime dataFechamento;

    @Column(name = "PEDIDO_DATA_ENTREGA")
    private LocalDateTime dataEntrega;

    @Column(name = "PEDIDO_DATA_PAGAMENTO")
    private LocalDateTime dataPagamento;

    @Column(name = "PEDIDO_VALOR_PRODUTO", nullable = false)
    private BigDecimal valorProduto = BigDecimal.ZERO;

    @Column(name = "PEDIDO_VALOR_FRETE", nullable = false)
    private BigDecimal valorFrete = BigDecimal.ZERO;

    @Column(name = "PEDIDO_VALOR_TOTAL", nullable = false)
    private BigDecimal valorTotal = BigDecimal.ZERO;

    @Column(name = "PEDIDO_STATUS", nullable = false)
    private PedidoStatus status = PedidoStatus.ABERTO;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ENDERECO_ID", nullable = false)
    private ClienteEndereco endereco;

    @Column(name = "PEDIDO_FORMA_PAGAMENTO")
    private PedidoFormaPagamento formaPagamento;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_PAGAMENTO_ID")
    private ClientePagamento clientePagamento;

    @ManyToMany
    List<PedidoProduto> pedidoProdutos;

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(ClienteEndereco endereco) {
        this.endereco = endereco;
    }

    public PedidoFormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(PedidoFormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ClientePagamento getClientePagamento() {
        return clientePagamento;
    }

    public void setClientePagamento(ClientePagamento clientePagamento) {
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

    public List<PedidoProduto> getPedidoProdutos() {
        return pedidoProdutos;
    }

    public void setPedidoProdutos(List<PedidoProduto> pedidoProdutos) {
        this.pedidoProdutos = pedidoProdutos;
    }
}
