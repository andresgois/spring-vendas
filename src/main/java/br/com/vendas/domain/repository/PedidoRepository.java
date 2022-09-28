package br.com.vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vendas.domain.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
    
}
