package DesafioAula6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collection;

public class Exe3 {

	/*
	 * Considerando quantidadeNumeros = 50000:
	 * Tempo gasto com ArrayList: 3 ms.
	 * Tempo gasto com HashSet: 5 ms.
	 * Tempo gasto com LinkedList: 1 ms.
	 * 
	 * 
	 * quantidadeNumeros = 100.000
	 * Tempo gasto com ArrayList: 4 ms.
	 * Tempo gasto com HashSet: 9 ms.
	 * Tempo gasto com LinkedList: 6 ms.
	 * 
	 * 
	 * quantidadeNumeros = 1.000.000
	 * Tempo gasto com ArrayList: 35 ms
	 * Tempo gasto com HashSet: 162 ms
	 * Tempo gasto com LinkedList: 77 ms.
	 * 
	 */

	public static void main(String[] args) {
		int quantidadeNumeros = 50000;

		// Testando com ArrayList
		Collection<Integer> listaArrayList = new ArrayList<>();
		long tempoArrayList = testarColecao(listaArrayList, quantidadeNumeros);
		System.out.println("Tempo gasto com ArrayList: " + tempoArrayList + " ms");

		// Testando com HashSet
		Collection<Integer> listaHashSet = new HashSet<>();
		long tempoHashSet = testarColecao(listaHashSet, quantidadeNumeros);
		System.out.println("Tempo gasto com HashSet: " + tempoHashSet + " ms");

		// Testando com LinkedList
		Collection<Integer> listaLinkedList = new LinkedList<>();
		long tempoLinkedList = testarColecao(listaLinkedList, quantidadeNumeros);
		System.out.println("Tempo gasto com LinkedList: " + tempoLinkedList + " ms");
	}

	private static long testarColecao(Collection<Integer> colecao, int quantidadeNumeros) {
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < quantidadeNumeros; i++) {
			colecao.add(i);
		}
		long fim = System.currentTimeMillis();

		return fim - inicio;
	}
}
