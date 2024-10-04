package day1204.ArqObjeto;

import java.io.*;
import java.util.*;

public class EscObjeto {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		File caminho = new File("C:/Users/DELL/Documentos");
		
		if(caminho.exists()) {
			System.out.println("Pasta ja existente!");
		}else {
			caminho.mkdirs();
			System.out.println("Criando agora...");
			System.out.println("Arquivo criando!");
		}
		
		File arquivo = new File(caminho, "pessoa.db");
		System.out.println(arquivo.getAbsolutePath());
			
			try {
				ObjectOutputStream arqObjeto = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
				Pessoa p1 = new Pessoa();
//				p1.setNome("Angelo");
//				p1.setSobrenome("Muniz");
//				
//				arqObjeto.writeObject(p1);
//				arqObjeto.close();
				String opc;
				Pessoa[] lista= new Pessoa[10];
				int cont = 0;
			
			do {
				System.out.println("lendo informações da pessoa"+ (cont+1));
				System.out.println("qual seu nome?");
				String nome = ler.next();
				System.out.println("qual seu sobrenome?");
				String sobrenome = ler.next();
				lista[cont] = new Pessoa();
				lista[cont].setNome(nome);
				lista[cont].setSobrenome(sobrenome);
				System.out.println("Team mais pessoas? s-sim n-não");
				opc = ler.next().toLowerCase();
				cont++;
			}
			while(opc.equals("s"));
	
			arqObjeto.writeObject(lista);
			arqObjeto.close();
	
			}

			catch(IOException e){
				System.out.println("Erro!!");
			}
			
		}
	}
