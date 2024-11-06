package br.com.fiap.banco;

public class SaldoInsuficiente extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SaldoInsuficiente(String mensagem) {
		super(mensagem);
	}

}
