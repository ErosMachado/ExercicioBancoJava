package br.com.fiap.banco;

public class SaldoInsuficiente extends Exception {
	
	SaldoInsuficiente(String mensagem) {
		super(mensagem);
	}

}
