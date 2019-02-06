package com.natan.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.natan.cursomc.domain.enums.EstadoPagamento;

/**
 * @author natancardosodev
 *
 */
@Entity
// mapeamento de herança, pode ser uma fusao de tabelas ou para cada filha
// quando se tem poucos atributos na subclasse pode ser feito a fusao, Joined
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Pagamento implements Serializable{
	// a classe é abstrata para garantir que não seja possivel
	// instanciar objetos do tipo pagamento, mas das suas subclasses

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	// O enum EstadoPagamento será armazenado como integer 
	private Integer estado;
	
	// Proteção para referência cíclica na serialização Json
	// Inserir essa anotacao no lado que 
	// quer que NÃO venha os objetos associados
	// necessário quando ambos tem conhecimento do outro
	// mas apenas um terá o dominio
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId
	// Para que o id de pgto seja o mesmo de pedido
	private Pedido pedido;
	
	public Pagamento () {
		
	}

	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
		super();
		this.id = id;
		this.estado = estado.getCodigo();
		this.pedido = pedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPagamento getEstado() {
		return EstadoPagamento.toEnum(estado);
	}

	public void setEstado(EstadoPagamento estado) {
		this.estado = estado.getCodigo();
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}