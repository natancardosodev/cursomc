/**
 * 
 */
package com.natan.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natan.cursomc.domain.Pedido;
import com.natan.cursomc.repositories.PedidoRepository;
import com.natan.cursomc.services.exception.ObjectNotFoundException;


/**
 * @author natancardosodev
 *
 */
@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository rep;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
