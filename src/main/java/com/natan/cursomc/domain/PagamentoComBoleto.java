package com.natan.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.natan.cursomc.domain.enums.EstadoPagamento;

/**
 * @author natancardosodev
 *
 */
@Entity
public class PagamentoComBoleto extends Pagamento {
	
	// não precisa do hashCodeEquals, pois a referência é feita pelo pai
	// não precisa colocar o implements Serializable
	private static final long serialVersionUID = 1L;

	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		
	}

	// Gerar Construtor from Superclass
	// e add atributos da classe filha
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,
			Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
