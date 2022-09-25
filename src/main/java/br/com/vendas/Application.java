package br.com.vendas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.vendas.domain.entity.Cliente;
import br.com.vendas.domain.repository.ClientesRepository;

@SpringBootApplication
public class Application {
    
   /*@Bean
    public CommandLineRunner init(@Autowired ClientesRepository clientes) {
        return args -> {
            System.out.println("========== Salva ==========");
            Cliente cliente = new Cliente();
            cliente.setNome("Andre Gois");
            clientes.salvarCliente(cliente);
            clientes.salvarCliente(new Cliente("Andreia"));
            System.out.println("========== Lista ==========");
            List<Cliente> todos = clientes.obterTodos();
            // método de referece do java 8
            todos.forEach(System.out::println);
            
            System.out.println("========== Atualiza ==========");
            todos.forEach(c -> {
                c.setNome(c.getNome()+" Atualizado");
                clientes.atualizarCliente(c);
            });
            
            todos = clientes.obterTodos();
            todos.forEach(System.out::println);
            System.out.println("========== Busca ==========");
            clientes.buscarPorNome("Andrei").forEach(System.out::println);
            
            System.out.println("========== Delete ==========");
            clientes.deleteCliente(1);
            
            todos = clientes.obterTodos();
            todos.forEach(System.out::println);
            
            System.out.println("========== Deleta todos ==========");
            
            clientes.obterTodos().forEach( c -> {
                clientes.deleteCliente(c);
            });
            
            todos = clientes.obterTodos();
            if(todos.isEmpty()) {
                System.out.println("A Lista está vazia");
            }else {
                todos.forEach(System.out::println); 
            }
                
        };
    }*/
    
    /*@Bean
    public CommandLineRunner init(@Autowired ProdutosRepository pr) {
        return args -> {
           pr.save(new Produto("Chinela",  new BigDecimal(25.90)));
           pr.save(new Produto("Café",  new BigDecimal(8.90)));
           pr.save(new Produto("Melão",  new BigDecimal(3.75)));
           
           List<Produto> todos = pr.obterTodos();
           // método de referece do java 8
           todos.forEach(System.out::println);
           
           System.out.println("========== Atualiza ==========");
           todos.forEach(c -> {
               c.setDescricao((c.getDescricao()+" Atualizado"));
               pr.atualizar(c);
           });
           
           todos = pr.obterTodos();
           todos.forEach(System.out::println);
           System.out.println("========== Busca ==========");
           pr.buscaPorDescricao("Chi").forEach(System.out::println);
           
           System.out.println("========== Delete ==========");
           pr.remover(1);
           
           todos = pr.obterTodos();
           todos.forEach(System.out::println);
           
           System.out.println("========== Deleta todos ==========");
           
           pr.obterTodos().forEach( c -> {
               pr.remover(c);
           });
           
           todos = pr.obterTodos();
           if(todos.isEmpty()) {
               System.out.println("A Lista está vazia");
           }else {
               todos.forEach(System.out::println); 
           }
        };
    }*/
    
    @Bean
    public CommandLineRunner init(@Autowired ClientesRepository clientes) {
        return args -> {
            System.out.println("========== Salva ==========");
            Cliente cliente = new Cliente();
            cliente.setNome("Andre Gois");
            clientes.save(cliente);
            clientes.save(new Cliente("Andreia"));
            
            boolean existe = clientes.existsByNome("Andreia");
            System.out.println("Existe um cliente com esse nome, Andreia? : "+existe);
            
            /*System.out.println("========== Lista ==========");
            List<Cliente> todos = clientes.findAll();
            // método de referece do java 8
            todos.forEach(System.out::println);
            
            System.out.println("========== Atualiza ==========");
            todos.forEach(c -> {
                c.setNome(c.getNome()+" Atualizado");
                clientes.save(c);
            });
            
            todos = clientes.findAll();
            todos.forEach(System.out::println);
            
            System.out.println("========== Busca ==========");
            clientes.findByNomeLike("Andrei").forEach(System.out::println);
            
            System.out.println("========== Delete ==========");
            clientes.delete(cliente);
            
            todos = clientes.findAll();
            todos.forEach(System.out::println);
            
            System.out.println("========== Deleta todos ==========");
            
            clientes.findAll().forEach( c -> {
                clientes.delete(c);
            });
            
            todos = clientes.findAll();
            if(todos.isEmpty()) {
                System.out.println("A Lista está vazia");
            }else {
                todos.forEach(System.out::println); 
            }*/
                
        };
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
