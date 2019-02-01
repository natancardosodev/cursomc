/**
 * 
 */
package com.natan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natan.cursomc.domain.Endereco;

/**
 * @author natancardosodev
 *
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
