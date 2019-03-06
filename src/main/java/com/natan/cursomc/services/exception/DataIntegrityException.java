package com.natan.cursomc.services.exception;

/**
 * @author natancardosodev
 * Responsavel por retornar mensagens de exceção
 * quando houver erro ou registro vazio
 */
public class DataIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	// Repassando a mensagem de exceção
	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	// Recebe a mensagem e a causa do que aconteceu antes
	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
