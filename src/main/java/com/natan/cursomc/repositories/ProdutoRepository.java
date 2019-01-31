/**
 * 
 */
package com.natan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natan.cursomc.domain.Produto;

/**
 * @author natancardosodev
 *
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
