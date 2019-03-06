/**
 * 
 */
package com.natan.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natan.cursomc.domain.Cliente;
import com.natan.cursomc.services.ClienteService;

/**
 * @author NatanPC
 * Classe dos Controladores REST
 */
@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> listar(@PathVariable Integer id) {
		
		Cliente obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
		// O ResponseEntity é um tipo especial do Spring que já
		// encapsula várias informações de uma resposta HTTP para
		// um serviço REST. Para verificar que deu certo usa-se o ok()
	}
	
}
