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

	// investir:

	
	
	public void investirCorrente(String tipoProduto, double valor) {
		double tx = 0;
		String tiposProduto = "LCI";

		if (tiposProduto.equals("CDB")) {
			tx = 0.01;
		} else if (tiposProduto.equals("LCI")) {
			tx = 0.009;
		} else if (tiposProduto.equals("LCA")) {
			tx = 0.008;
		}

	}

	@Override
	public void exibirSaldo() {
		System.out.println("Numero do cliente: " + this.numeroConta);
		System.out.println("Saldo: R$ " + this.saldo);
		System.out.println("Data de nascimento: " + this.dataNasc);
		System.out.println("Data de abertura conta: " + this.numeroConta);
		System.out.println("----------------");
	}
}
