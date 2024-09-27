
//Construtor que me permite omitir o tamanho da lista e construa uma lista com 10 elementos
//Método que pesquisa e diz se existe ou não public boolean contem(T elemento);
//Método que remove o elemento pelo elemento public boolean remove(T elemento);
//Método para limpar a lista public void limpar();
//Criar o método que retorne o tamanho da lista public int tamanho();
//Criar o método que verifica se a lista está vazia public boolean estaVazia();
//Método que retorna o último índice que determinado elemento aparece na lista e retorna o índice, semelhante ao indiceDe(), porém lá ele encerra o método no momento que encontrar o elemento, aqui quero que ele continue pesquisando e encontre a última posição.
//public int ultimaPosicaoElemento(T elemento);

package InitialTree;

import java.util.ArrayList;

public class exemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("A");
		lista.add("c");
		lista.add("d");
		lista.add("e");
		lista.add("c");
		lista.add("f");
		lista.add(1, "f");
		System.out.println("A lista tem um 'a' "+ lista.contains("A"));
		System.out.println("A lista tem um 'W' "+ lista.contains("W"));
	}
}
