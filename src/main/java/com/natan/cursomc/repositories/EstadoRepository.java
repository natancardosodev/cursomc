/**
 * 
 */
package com.natan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natan.cursomc.domain.Estado;

/**
 * @author natancardosodev
 *
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
