/**
 * 
 */
package com.natan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natan.cursomc.domain.Categoria;

/**
 * @author natancardosodev
 *
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
