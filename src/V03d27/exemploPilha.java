package V03d27;

import java.util.*;

public class exemploPilha {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		
		//push adiciona na pilha
		//pop remove na pilha
		
		pilha.push("O Vento nos salgueiros");
		pilha.push("Tres Porquinhos");
		pilha.push("Meninas Selvagens");
		pilha.push("Dulce Amargo");
		pilha.push("Saboroso Cadaver");
		
		System.out.println(pilha);
		System.out.println("Desempilhando '" +pilha.pop()+ "'");
	}
}
