/**
 * 
 */
package com.natan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natan.cursomc.domain.Cliente;

/**
 * @author natancardosodev
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
