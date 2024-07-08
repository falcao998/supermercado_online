package br.souzasystem.annotations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class GeradorSequencialPedidoListener {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public synchronized String generateSequence() {
        String maxSequence = (String) entityManager.createQuery("SELECT MAX(e.codigo) FROM Pedido e")
                .getSingleResult();

        if (maxSequence == null) {
            return String.format("%08d", 1);
        }

        int nextSequence = Integer.parseInt(maxSequence) + 1;
        return String.format("%08d", nextSequence);
    }
}
