package V03d27;

import java.util.*;

public class exemplo2Array {
	// arrayList.ex2
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		// para adicionar um elemento na lista é:
		lista.add("A");
		lista.add("B");
		lista.add("J");
		lista.add("C");
		lista.add("Z");
		lista.add("T");

		// abaixo adiciona um elemento na posição desejada (o numero)
		lista.add(3, "D");

		System.out.println(lista);
		lista.sort(null);
		// sort deve ser reenserido a cada vez q desejar usa-lo
		// o null faz com que ordene de forma natural ja que não ta sendo escolhida uma
		// forma de ordem
		System.out.println(lista);
		System.out.println("Tem T na lista?" + lista.contains("T"));
		System.out.println("Onde esta o T?\n" + lista.indexOf("T"));

		// pode ser utilizado lastindexof para mostrar a ultima ocorrencia caso tenham
		// dois valores iguais
		System.out.println("Onde esta a ultima ocorrencia de T?\n" + lista.lastIndexOf("T"));
		System.out.println("Removendo o item D da lista" + lista.remove("D"));
		System.out.println("A lista esta vazia?" + lista.isEmpty());
		lista.clear();
		System.out.println("A lista esta vazia?" + lista.isEmpty());
	}
}
