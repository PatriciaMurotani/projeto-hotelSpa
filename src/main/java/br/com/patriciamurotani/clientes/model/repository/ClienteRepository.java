package br.com.patriciamurotani.clientes.model.repository;

import br.com.patriciamurotani.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}

