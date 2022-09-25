package br.com.vendas.domain.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;
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
    
    @Transactional
    public Produto atualizar(Produto p) {
        entityManager.merge(p);
        return p;
    }
    
    @Transactional
    public void remover(Produto p) {
        if(!entityManager.contains(p)) {
            // se não existir, ele sincroniza
            p = entityManager.merge(p);
        }
        entityManager.remove(p);
    }
    
    @Transactional
    public void remover(Integer id) {
        Produto p = entityManager.find(Produto.class, id);
        remover(p);
    }
    
    @Transactional(readOnly = true)
    public List<Produto> buscaPorDescricao(String descricao) {
        String jpql = "SELECT p FROM Produto p WHERE p.descricao LIKE :descricao"; 
        TypedQuery<Produto> query = entityManager.createQuery(jpql, Produto.class);
        query.setParameter("descricao", "%"+descricao+"%");
        return query.getResultList();
    }
    
    @Transactional(readOnly = true)
    public List<Produto> obterTodos() {
        return entityManager
                .createQuery("FROM Produto", Produto.class)
                .getResultList();
    }
};
