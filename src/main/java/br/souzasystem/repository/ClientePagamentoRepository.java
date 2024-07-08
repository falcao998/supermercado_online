package br.souzasystem.repository;

import br.souzasystem.domain.entity.ClientePagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientePagamentoRepository extends JpaRepository<ClientePagamento, String> {
}
