/**
 * 
 */
package com.natan.cursomc.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	public ResponseEntity<Categoria> listar(@PathVariable Integer id) {
		
		Categoria obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
		// O ResponseEntity é um tipo especial do Spring que já
		// encapsula várias informações de uma resposta HTTP para
		// um serviço REST. Para verificar que deu certo usa-se o ok()
	}
	
	// @RequestBody converte o json em objeto java automaticamente
	@PostMapping()
	public ResponseEntity<Void> insert(@RequestBody Categoria obj){
		obj = service.insert(obj);
		// fromCurrentRequest() - captura a URI
		// path - o contexto, ex: /{id}
		// toUri - converte tudo em uma nova URI
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		// created() já atribui o code 201 para
		// informar que um novo recurso foi criado
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@RequestBody Categoria obj,@PathVariable Integer id){ 
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
}
