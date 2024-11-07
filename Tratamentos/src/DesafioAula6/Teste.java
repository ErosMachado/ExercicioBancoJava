package DesafioAula6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(new Usuario(1, "Pessoa1", "12345"));
		lista.add(new Usuario(5, "Pessoa2", "12345"));
		lista.add(new Usuario(3, "Pessoa3", "12345"));
		lista.add(new Usuario(4, "Pessoa4", "12345"));
		lista.add(new Usuario(2, "Pessoa5", "12345"));

		System.out.println("Lista ordenada: ");
		for (Usuario usuario : lista) {
			System.out.println(usuario.getNome());
		}

		Collections.sort(lista);

		System.out.println("Lista desordenada");
		for (Usuario usuario : lista) {
			System.out.println(usuario.getNome());

		}

	}

}
