package executaveis;

import br.com.fiap.banco.Cliente;
import br.com.fiap.banco.ContaCorrente;
import br.com.fiap.banco.*;

public class CriarConta {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Eduardo Sousa", "edua@gmail.com", "133.365.453/32", "(12) 99831-9649", 1002,
				10000.00, "10/10/2003");
		
		CDB cdb = new CDB();
		LCA lca = new LCA();
		LCI lci = new LCI();
		
		ContaCorrente cliente11 = new ContaCorrente(cliente1, 200000);
		cliente11.depositar(10);
		cliente11.consultarSaldo();

		cliente11.investimento(lci, 100000);
		cliente11.investimento(cdb, 100000);
		cliente11.investimento(lca, 100000);
		cliente11.exibirSaldo();
	}
}
