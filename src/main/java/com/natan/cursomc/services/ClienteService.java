/**
 * 
 */
package com.natan.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natan.cursomc.domain.Cliente;
import com.natan.cursomc.repositories.ClienteRepository;
import com.natan.cursomc.services.exception.ObjectNotFoundException;


/**
 * @author natancardosodev
 *
 */
@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository rep;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
