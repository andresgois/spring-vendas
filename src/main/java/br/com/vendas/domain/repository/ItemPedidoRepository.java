package br.com.vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vendas.domain.entity.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{
    
}
