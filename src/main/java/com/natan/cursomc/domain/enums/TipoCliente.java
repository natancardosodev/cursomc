/**
 * 
 */
package com.natan.cursomc.domain.enums;

/**
 * @author natancardosodev
 *
 */
public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int codigo;
	private String descricao;
	
	private TipoCliente(int codigo, String descricao) {
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
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("O id "+ cod + " é inválido!");
	}
}
