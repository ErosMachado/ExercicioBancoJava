package br.com.fiap.banco;

public class Conta {
	String nomeCliente;
	String cpfCliente;
	int numeroConta;
	double saldo;

	public Conta(String nomeCliente, String cpfCliente, int numeroConta, double saldoInicial) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldoInicial;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(Conta contaDestino, double valor) {
		if (sacar(valor)) {
			contaDestino.depositar(valor);
		}
	}

	public void consultarSaldo() {
		System.out.println("Saldo da conta " + numeroConta + ": R$" + saldo);
	}

	public void exibirSaldo() {
		System.out.println("Nome: " + nomeCliente);
		System.out.println("Saldo: R$ "+ saldo);
		System.out.println("----------------");
	}//
}
