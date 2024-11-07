package DesafioAula6;

import java.util.Iterator;
import java.util.List;

public class Usuario implements Comparable<Usuario> {
	private int idUsuario;
	private String nome;
	private String senha;
	
	/*

	List<String> lista1 = new Arraylist<String>();
	lista1.add("Pedro");
	lista1.add("João");
	lista1.add("Maria");
	lista1.add("Marcos");
	lista1.add("Anna");
	lista1.add("Jose");
	lista1.add("Pedro");
	List<Usuario> list = new ArrayList<Usuario>();
	Usuario jose = new Usuario("Jose", "123");
	Usuario maria = new Usuario("Maria", "123");
	Usuario pedro = new Usuario("Pedro", "123");
	list.add(jose);
	list.add(maria);
	list.add(pedro);
	*/
	

	// Construtor
	public Usuario(int idUsuario, String nome, String senha) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
	}

	// Getters e Setters
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	// Implementa��o do m�todo compareTo
	@Override
	public int compareTo(Usuario user) {
		if (this.getIdUsuario() < user.getIdUsuario()) {
			return -1;
		}
		if (this.getIdUsuario() > user.getIdUsuario()) {
			return 1;
		}
		return 0;
	}

	
	
	// M�todo para remover usu�rios com nome espec�fico da lista
	public List<Usuario> remover(List<Usuario> list, String nome) {
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome().equals(nome)) { // Corrigido para usar equals()
				iterator.remove();
			}
		}
		return list;
	}
}
