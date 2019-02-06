/**
 * 
 */
package com.natan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natan.cursomc.domain.ItemPedido;

/**
 * @author natancardosodev
 *
 */
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{

}
