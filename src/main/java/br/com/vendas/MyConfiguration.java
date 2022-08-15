<<<<<<< HEAD
package br.com.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.vendas.Annotations.Dev;

@Configuration
@Dev
public class MyConfiguration {

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
=======
package br.com.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.vendas.Annotations.Dev;

@Configuration
@Dev
public class MyConfiguration {

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
>>>>>>> 32e045a3751e9a59a5fd2a325351d1cb44d7282b
