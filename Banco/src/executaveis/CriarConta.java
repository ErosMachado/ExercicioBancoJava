package executaveis;

import br.com.fiap.banco.Cliente;
import br.com.fiap.banco.Conta;
import br.com.fiap.banco.ContaCorrente;

public class CriarConta {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Eduardo Sousa", "edua@gmail.com", "133.365.453/32", "(12) 99831-9649", 1002,
				10000.00, "10/10/2003");
		
		Conta cliente11 = new ContaCorrente(cliente1, 200000);
		cliente11.depositar(10000);
		cliente11.consultarSaldo();

	}
}
