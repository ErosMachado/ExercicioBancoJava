package br.com.fiap.banco;

public class Executavel {
	public static void main(String[] args) throws SaldoInsuficiente {
		/*
		 * 
		 * Não se faz instância de superClass!
		 * 
		 */

	
		Conta conta1 = new ContaCorrente(null, 1001);
		Conta conta2 = new ContaCorrente(null, 1253);
		Conta conta3 = new ContaCorrente(null, 8516);


		//testes de conta
		conta1.consultarSaldo();
		conta1.sacar(300.00);
		conta1.consultarSaldo();

		conta2.depositar(500.00);
		conta2.consultarSaldo();

		conta3.transferir(conta1, 1000.00);
		conta1.consultarSaldo();
		conta3.consultarSaldo();

		conta1.setSaldo(100000000);
		
		conta3.exibirSaldo();

	}
}
