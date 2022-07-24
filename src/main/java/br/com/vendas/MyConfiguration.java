package br.com.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean(name = "myTestConfiguration")
	public String myTestConfiguration() {
		return "Sistema de Vendas";
	}
}
