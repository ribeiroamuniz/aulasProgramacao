package day1204.Arquivotexto;

import java.io.*;

public class Exemplo {
	public static void main(String[] args) {
		try {
			BufferedWriter arquivotexto = new BufferedWriter(new FileWriter("./texto.txt"));
			for (int i=0; i<10; i++) {
				arquivotexto.append("linha "+i+" do arquivo \n");
			}
			arquivotexto.close();
			System.out.println("ok");
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro ao escrever arquivo.");
		}
		catch(IOException e) {
			System.out.println("Erro ao criar arquivo.");
		}
	}
}
