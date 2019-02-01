package com.natan.cursomc.domain.enums;

/**
 * @author natancardosodev
 *
 */
public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int codigo;
	private String descricao;
	
	private EstadoPagamento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	// método responsavel por verificar se o cliente
	// solicitado é mesmo valido e retorna-lo
	// método statico pode ser rodado mesmo sem está instanciado
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("O id "+ cod + " é inválido!");
	}
}
