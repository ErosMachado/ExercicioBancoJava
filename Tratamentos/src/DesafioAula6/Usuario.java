package DesafioAula6;

import java.util.Iterator;
import java.util.List;

public class Usuario implements Comparable<Usuario> {
	private int idUsuario;
	private String nome;
	private String senha;

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

	// Implementação do método compareTo
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

	// Método para remover usuários com nome específico da lista
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
