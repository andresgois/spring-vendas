package br.com.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vendas.model.Client;
import br.com.vendas.repository.ClientRepository;

@Service
public class ClientServices {

	private ClientRepository repository;
	
	@Autowired
	public ClientServices(ClientRepository repository) {
		this.repository = repository;
	}
	
	public void saveClient(Client client) {
		verifyClient(client);
//		ClientRepository clientRepository = new ClientRepository();
//		clientRepository.persistence(client);
		this.repository.persistence(client);
	}
	
	public void verifyClient(Client client) {
		// Aplica as validações de cliente
	}
}
