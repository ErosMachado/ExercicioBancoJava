package DesafioAula6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {

		List<String> lista1 = new ArrayList<String>();
		lista1.add("Pedro");
		lista1.add("Joãoo");
		lista1.add("Maria");
		lista1.add("Marcos");
		lista1.add("Anna");
		lista1.add("Jose");
		lista1.add("Pedro");
		List<Usuario> list = new ArrayList<Usuario>();
		Usuario jose = new Usuario(12, "Jose", "123");
		Usuario maria = new Usuario(13, "Maria", "123");
		Usuario pedro = new Usuario(14, "Pedro", "123");
		list.add(jose);
		list.add(maria);
		list.add(pedro);

		System.out.println("Lista ordenada: ");
		for (Usuario usuario : list) {
			System.out.println(usuario.getNome());
		}

		Collections.sort(list);

		System.out.println("Lista desordenada");
		for (Usuario usuario : list) {
			System.out.println(usuario.getNome());

		}

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

		// para remover usuario
		System.out.println("Removendo usuário:");
		remover("Pedro", list);
		for (Usuario usuario : list) {
			System.out.println(usuario.getNome());
		}

		Map<String, Usuario> mapa = new HashMap<>();
		mapa.put("Maria", new Usuario(4, "Maria", "123485"));
		mapa.put("Jose", new Usuario(3, "Jose", "123745"));
		mapa.put("Edu", new Usuario(1, "Edu", "1452345"));
		mapa.put("Marta", new Usuario(2, "Marta", "1235445"));
		mapa.put("Carlos", new Usuario(6, "Carlos", "123545"));

		Usuario usuario = mapa.get("Jose");
		System.out.println(usuario.getNome());
	}

	private static List<Usuario> remover(String string, List<Usuario> list) {
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			Object nome = null;
			if (usuario.getNome().equals(nome)) { // Corrigido para usar equals()
				iterator.remove();
			}
		}
		return list;
	}
	
	
	
}
