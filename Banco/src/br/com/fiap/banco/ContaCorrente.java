package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	private double saldoInvestimentos;

	public ContaCorrente(Cliente cliente, int numeroConta) {
		super(cliente, numeroConta);

	}

	public double getSaldoInvestimentos() {
		return saldoInvestimentos;
	}

	public void setSaldoInvestimentos(double saldoInvestimentos) {
		this.saldoInvestimentos = saldoInvestimentos;
	}
	
	//investir
	public void investimento(Produto produto, double valor) throws SaldoInsuficiente { //polimorfismo
		if(this.sacar(valor)) {
		this.saldoInvestimentos += produto.investir(valor);
		}
	}


	@Override
	public void exibirSaldo() {
		System.out.println("----------------");
		System.out.println("Numero do cliente: " + this.numeroConta);
		System.out.println("Saldo: R$ " + this.saldo);
		System.out.println("Data de nascimento: " + this.dataNasc);
		System.out.println("Saldo da conta = " + this.saldo);
		System.out.println("Saldo investimento = " + this.saldoInvestimentos);
		System.out.println("Data de abertura conta: " + this.numeroConta);
		System.out.println("----------------");
	}
}
