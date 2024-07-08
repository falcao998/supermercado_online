package br.souzasystem.repository;

import br.souzasystem.domain.entity.ProdutoSubCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoSubCategoriaRepository extends JpaRepository<ProdutoSubCategoria, String> {
}
