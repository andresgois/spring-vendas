package br.com.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("development")
public class MyConfiguration {

	@Bean(name = "myTestConfiguration")
	public String myTestConfiguration() {
		return "Sistema de Vendas";
	}
	
//	@Bean
//	public CommandLineRunner execute() {
//		return args -> {
//			System.out.println("Rodando em ambiente de Homologação!");
//		};
//	}
}
