/**
 * 
 */
package com.natan.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natan.cursomc.domain.Categoria;
import com.natan.cursomc.repositories.CategoriaRepository;

/**
 * @author natancardosodev
 *
 */
@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository rep;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = rep.findById(id);
		return obj.orElse(null);
	}
}
