package br.com.globalcode.testes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteComparable {

	public static void main(String[] args) {
		
		Set nomes = new TreeSet();
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Ana Paula");
		nomes.add("Amanda");
		
		Iterator iterator = nomes.iterator();
		
		int i = 0;
		System.out.println("Lista em ordem alfabetica dos nomes: \n");
		while (iterator.hasNext()){
			String nome = (String) iterator.next();
			System.out.println("Nome["+ i++ + "] " + nome);
		}
	}
}
