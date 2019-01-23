/**
 * 
 */
package com.natan.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natan.cursomc.domain.Categoria;
import com.natan.cursomc.services.CategoriaService;

/**
 * @author NatanPC
 * Classe dos Controladores REST
 */
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;

	@GetMapping("/{id}")
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		// O ResponseEntity é um tipo especial do Spring que já
		// encapsula várias informações de uma resposta HTTP para
		// um serviço REST. Para verificar que deu certo usa-se o ok()
	}
	
}
