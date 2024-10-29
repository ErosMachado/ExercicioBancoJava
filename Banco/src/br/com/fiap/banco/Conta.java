package br.com.fiap.banco;

public class Conta {
	private String nomeCliente;
	private String cpfCliente;
	private int numeroConta;
	private double saldo;

	public Conta(String nomeCliente, String cpfCliente, int numeroConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	// getters / stters ctrl 3

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/*
	 * public Conta(String nomeCliente, String cpfCliente, int numeroConta, double
	 * saldoInicial) { this.nomeCliente = nomeCliente; this.cpfCliente = cpfCliente;
	 * this.numeroConta = numeroConta; this.saldo = saldoInicial; }
	 */
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
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("----------------");
	}//
}
