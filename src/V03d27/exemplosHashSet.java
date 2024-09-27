package V03d27;

import java.util.*;

public class exemplosHashSet {
	public static void main(String[] args) {
		HashSet<String> compras = new HashSet<>();//serve para que não seja permitido adicionar elementos repetidos
		System.out.println("Adicionando arroz a lista " +compras.add("Arroz"));
		System.out.println("Adicionando ketchup a lista " +compras.add("Ketchup"));
		System.out.println("Adicionando amandita a lista " +compras.add("Amandita"));
		System.out.println("Adicionando doritos a lista " +compras.add("Doritos"));
		
		System.out.println(compras);
		
		System.out.println("Adicionando doritos a lista " +compras.add("Doritos"));
	}
}
