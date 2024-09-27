package V03d27;

import java.util.*;

public class ExemploHashMap {
	public static void main(String[] args) {
		HashMap<String, String> capitais = new HashMap<>();
		//uma string para chave e outra pro objeto(motivo de ter duas)
		
		capitais.put("RS", "Porto Alegre");
		capitais.put("SP", "São Paulo");
		capitais.put("RJ", "Rio de Janeiro");
		capitais.put("SC", "Jurerê");
		
		System.out.println(capitais);
		capitais.put("RS", "Camaquã");
		
		System.out.println(capitais);
		System.out.println("Lista de estados.");
		for(String estado: capitais.keySet())
			System.out.println(estado +" ");
		
		System.out.println("Lista de cidades.");
		for(String cidade: capitais.values())
			System.out.println(cidade +" ");
		
		System.out.println("Apagando a chave RJ da lista" +capitais.remove("RJ"));
		
		System.out.println("A lista tem uma cidade chamada Porto Alegre" +capitais.containsValue("Porto Alegre"));
		
		//put adiciona
		//remove remove
	}
}
