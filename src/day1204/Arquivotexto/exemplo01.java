package day1204.Arquivotexto;

import java.io.*;

public class exemplo01 {
	public static void main(String[] args) {
		try {
			BufferedReader arquivotexto = new BufferedReader(new FileReader("./texto.txt"));
			String texto = " ";
			String linha = "";
			while (linha!=null) {
				linha = arquivotexto.readLine();
				if (linha!=null)
				texto+=linha;
			}
				System.out.println(texto);
				arquivotexto.close();
		}
		catch(IOException e) {
			System.out.println("Erro ao ler.");
		}
	}
}
