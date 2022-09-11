package br.com.vendas.domain.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import br.com.vendas.domain.entity.Cliente;

@Repository
public class Clientes {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    private static String INSERT = "INSERT INTO cliente (nome) VALUES (?)";
    private static String SELECT_ALL = "SELECT * FROM cliente";
    private static String UPDATE = "UPDATE cliente SET nome = ? WHERE id = ?";
    private static String DELETE = "DELETE FROM cliente WHERE id = ?";
    
    public Cliente salvarCliente(Cliente cliente) {
        jdbcTemplate.update(INSERT, new Object[] {cliente.getNome()});
        return cliente;
    }
    
    public Cliente atualizarCliente(Cliente cliente) {
        jdbcTemplate.update(UPDATE, new Object[] {cliente.getNome(), cliente.getId()});
        return cliente;
    }
    
    public void deleteCliente(Cliente cliente) {
        deleteCliente(cliente.getId());
    }
    
    public void deleteCliente(Integer id) {
        jdbcTemplate.update(DELETE, new Object[] {id});
    }
    
    public List<Cliente> obterTodos() {
        return jdbcTemplate.query(SELECT_ALL, rowMapperCliente()) ;
     }
    
    @SuppressWarnings("deprecation")
    public List<Cliente> buscarPorNome(String nome) {
        return jdbcTemplate.query(
                SELECT_ALL.concat(" WHERE nome LIKE ? "),
                new Object[]{"%"+nome+"%"},
                rowMapperCliente());
     }

    private RowMapper<Cliente> rowMapperCliente() {
        return new RowMapper<Cliente>(){
           
            @Override
             public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
                Integer id = rs.getInt("id");
                String nome = rs.getString("nome");
                 return new Cliente(id, nome);
             }
            
        };
    }
    
}
