package day1204.ArqObjeto;

import java.io.*;

public class lerObjeto {
	public static void main(String[] args) {
		File caminho = new File("C:/Users/DELL/Documentos");
		File arquivo = new File(caminho, "pessoa.db");
		try {
			ObjectInputStream arquivoObj = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));

			Pessoa[] lista = (Pessoa[]) arquivoObj.readObject();
			arquivoObj.close();
			int cont = 0;
			Pessoa p;
			do {
				p = lista[cont];
				if (p != null) {
					cont++;
				}
			} while (p != null);
			for (int i = 0; i < cont; i++) {
				System.out.println(lista[i]);
			}

		} catch (Exception e) {
			System.out.println("oi");
		}
	}
}
