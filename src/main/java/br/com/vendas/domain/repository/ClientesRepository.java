package br.com.vendas.domain.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.vendas.domain.entity.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Integer>{

    List<Cliente> findByNomeLike(String nome);
    
    
    /*@Autowired
    private JdbcTemplate jdbcTemplate;
    
    private static String INSERT     = "INSERT INTO cliente (nome) VALUES (?)";
    private static String SELECT_ALL = "SELECT * FROM cliente";
    private static String UPDATE     = "UPDATE cliente SET nome = ? WHERE id = ?";
    private static String DELETE     = "DELETE FROM cliente WHERE id = ?";
    
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
    }*/
    
}
