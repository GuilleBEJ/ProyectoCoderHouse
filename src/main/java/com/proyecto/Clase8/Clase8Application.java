package com.proyecto.Clase8;

import model.Client;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.ClientRepository;
import repository.ProductoRepository;

import java.util.Optional;

@SpringBootApplication
public class Clase8Application implements CommandLineRunner { //nos permite ejecutar comandos de java

	//se delega al spring la instacia de mi objeto repository
	@Autowired
	private ProductoRepository productRepository; //se instancia el repositpry de producto para poder guardar

	@Autowired
	private ClientRepository clientRepository;

	public static void main(String[] args) {SpringApplication.run(Clase8Application.class, args);}

	@Override
	public void run(String... args) throws Exception { //dentro de este metodo se ejecutan las sentencias codigo java
		System.out.println("Server listening on. http://localhost:8888/h2-console");

		//se crea el producto taza
		Product taza = new Product();
		taza.setDescription("Blanca con detalles negros");
		taza.setCode("porcelana");
		taza.setPrice(10);
		taza.setStock(20);
		this.productRepository.save(taza);
		

		//se crea un cliente
		Client cliente1 = new Client();
		cliente1.setName("Diego");
		cliente1.setLastname("Martinez");
		cliente1.setDocnumber("29089422");
		this.clientRepository.save(cliente1);
	}
}