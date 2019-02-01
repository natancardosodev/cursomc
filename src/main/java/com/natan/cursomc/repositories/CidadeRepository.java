/**
 * 
 */
package com.natan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natan.cursomc.domain.Cidade;

/**
 * @author natancardosodev
 *
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
