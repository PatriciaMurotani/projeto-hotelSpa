package br.com.patriciamurotani.clientes.model.repository;

import br.com.patriciamurotani.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}

