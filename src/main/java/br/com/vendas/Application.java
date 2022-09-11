package br.com.vendas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import br.com.vendas.domain.entity.Cliente;
import br.com.vendas.domain.repository.Clientes;

@SpringBootApplication
@RestController
public class Application {
    
    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
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
            
            /*System.out.println("========== Delete ==========");
            clientes.deleteCliente(1);
            
            todos = clientes.obterTodos();
            todos.forEach(System.out::println);
            
            System.out.println("========== Deleta todos ==========");
            
            clientes.obterTodos().forEach( c -> {
                clientes.deleteCliente(c);
            });*/
            
            todos = clientes.obterTodos();
            if(todos.isEmpty()) {
                System.out.println("A Lista está vazia");
            }else {
                todos.forEach(System.out::println); 
            }
                
        };
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
