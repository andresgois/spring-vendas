package br.com.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.vendas.Annotations.Dev;

@Configuration
@Dev
public class MyConfiguration {
    // Teste
    @Bean(name = "myTestConfiguration")
    public String myTestConfiguration() {
        return "Sistema de Vendas";
    }

    @Bean
    public CommandLineRunner execute() {
        return args -> {
            System.out.println("=====================================================================");
            System.out.println("=================Rodando em ambiente de Homologação!=================");
            System.out.println("=====================================================================");
        };
    }
}
