package br.com.vendas.domain.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.vendas.domain.entity.Produto;

@Repository
public class ProdutosRepository {
    
    @Autowired
    private EntityManager entityManager;
    
    @Transactional
    public Produto save(Produto p) {
        entityManager.persist(p);
        return p;
    }
}
