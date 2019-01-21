/**
 * 
 */
package com.natan.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NatanPC
 *
 */
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@GetMapping
	public String listar() {
		return "REST está funcionando";
	}
	
}
