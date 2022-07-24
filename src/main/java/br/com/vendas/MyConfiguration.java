package br.com.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean(name = "MyConfiguration")
	public String MyConfiguration() {
		return "Sistema de Vendas";
	}
}
