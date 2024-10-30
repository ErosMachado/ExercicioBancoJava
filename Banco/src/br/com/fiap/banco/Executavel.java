package br.com.fiap.banco;

public class Executavel {
	public static void main(String[] args) {

		Conta conta1 = new Conta("Eros Machado", "123.456.789-00", 1001, 1000.00);
		Conta conta2 = new Conta("Jo�o Silva", "987.654.321-00", 1002, 2000.00);
		Conta conta3 = new Conta("Maria Oliveira", "111.222.333-44", 1003, 3000.00);

		
		Cliente cliente1 = new Cliente("Eduardo Sousa","edua@gmail.com", "133.365.453/32", "(12) 99831-9649", 1002, 10000.00);
		
		//testes clientes:
		
		cliente1.getCpfCliente();
		System.out.println("--------------------");
		
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

	}
}
