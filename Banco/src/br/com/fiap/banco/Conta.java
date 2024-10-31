package br.com.fiap.banco;

import java.text.ParseException;

/*
 * Não se faz instância de superClass!
 *Aqui entra o abstract  
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta {
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	protected Date dataNasc = new Date();
	private Date dataAberturaConta = new Date();

	// constructor ctrl + 3 (generate constructor)
	// metodos ctrl + 3 (getters and setters)

	public Conta(String nomeCliente, int numeroConta, double saldo, Cliente cliente, String dataNasc,
			String dataAberturaConta) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cliente = cliente;

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dataNasc = format.parse(dataNasc);
		} catch (ParseException e) {
			System.err.println("Formato de data invalido: " + dataNasc);
			e.printStackTrace();
		}

		try {
			this.dataAberturaConta = format.parse(dataAberturaConta);
		} catch (ParseException e) {
			System.err.println("Formato de data invalido: " + dataNasc);
			e.printStackTrace();
		}

	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Date getDataAberturaConta() {
		return dataAberturaConta;
	}

	public void setDataAberturaConta(Date dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}

	public Conta(Date dataAberturaConta) {
		super();
		this.dataAberturaConta = dataAberturaConta;
	}

	public Conta(int numeroConta, double saldo, Cliente cliente, String dataNasc) {
	}

	public Conta(Cliente cliente2, int numeroConta2) {
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

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(Conta contaDestino, double valor) {
		if (this.sacar(valor)) {
			contaDestino.depositar(valor);
		}
	}

	public void consultarSaldo() {
		System.out.println("Saldo da conta " + numeroConta + ": R$" + saldo);
	}

	// transformar em abstract vai ajudar na generalização e especificação do
	// método, conforme a necessidade.
	public abstract void exibirSaldo();

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


}
