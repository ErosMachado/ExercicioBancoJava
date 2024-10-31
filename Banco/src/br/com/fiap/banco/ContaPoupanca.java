package br.com.fiap.banco;

public class ContaPoupanca extends Conta{
	
	private double SaldoContaPoupanca;

	public ContaPoupanca(Cliente clientePoupanca, int numeroContaPoupanca) {
		super(clientePoupanca, numeroContaPoupanca);
	}

	@Override
	public void exibirSaldo() {
		System.out.println("Numero do cliente poupanca: " + this.numeroConta);
		System.out.println("Saldo: R$ " + this.saldo);
		System.out.println("Data de nascimento: "+ this.dataNasc);
		System.out.println("Data de abertura conta: "+ this.numeroConta);
		System.out.println("----------------");
	}

	public double getSaldoContaPoupanca() {
		return SaldoContaPoupanca;
	}

	public void setSaldoContaPoupanca(double saldoContaPoupanca) {
		SaldoContaPoupanca = saldoContaPoupanca;
	}
}
