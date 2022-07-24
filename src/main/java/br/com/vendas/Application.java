package br.com.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	@Qualifier("MyConfiguration")
	private String myConfiguration;
	
	@GetMapping("/")
	public String helloWorld() {
		return myConfiguration;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
