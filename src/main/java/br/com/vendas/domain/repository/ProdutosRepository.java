package br.com.vendas.domain.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
    
    @Transactional
    public Produto atualizar(Produto p) {
        entityManager.merge(p);
        return p;
    }
    
    @Transactional
    public void remover(Produto p) {
        entityManager.remove(p);
    }
    
    @Transactional
    public void remover(Integer id) {
        Produto p = entityManager.find(Produto.class, id);
        remover(p);
    }
    
    @Transactional
    public List<Produto> buscaPorNome(String nome) {
        String jpql = "SELECT p FROM produto p WHERE p.nome LIKE :nome"; 
        TypedQuery<Produto> query = entityManager.createQuery(jpql, Produto.class);
        query.setParameter("nome", "%"+nome+"%");
        return query.getResultList();
    }
    
    @Transactional
    public List<Produto> boterTodos() {
        String nome = entityManager.createQuery("from produto", Produto.class);
        return new Produto(nome, null)
    }
};
