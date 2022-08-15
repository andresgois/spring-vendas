<<<<<<< HEAD
package br.com.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@ComponentScan(basePackages = ["br.com.vendas","br.com.vendas"])
public class Application {

	/*@Autowired
	@Qualifier("myTestConfiguration")
	private String myConfiguration;*/
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	@GetMapping("/")
	public String helloWorld() {
		//return myConfiguration;
		return applicationName;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
>>>>>>> 32e045a3751e9a59a5fd2a325351d1cb44d7282b
