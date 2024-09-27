package V03d27;

public class ExemploString {
	public static void main(String[] args) {
		String nome = "Jonas";
		String sobrenome = "Silva";
		String nomeCompleto = nome.concat(sobrenome);
		
		System.out.println("Nome completo: " +nomeCompleto);
		
		nomeCompleto = nomeCompleto.toLowerCase();//tudo minusculo
		nomeCompleto = nomeCompleto.toUpperCase();//tudo maiusculo
		
		System.out.println("Qual a posicao da letra A na String? " +nomeCompleto.indexOf("A"));
		System.out.println("Qual a ultima posição da letra A na String?" +nomeCompleto.lastIndexOf("A"));
		
		System.out.println("A string inicia com a letra J? " +nomeCompleto.startsWith("J"));
		System.out.println("A string termina com a letra a? " +nomeCompleto.endsWith("A"));
		
		String frase = "aula de programacao";
		System.out.println(frase);
		frase = frase.replace("programacao", "programacao II");
		System.out.println(frase);
		
		String[] vetor = frase.split(" ");
		for(String palavra:vetor) {
			System.out.println(palavra);
		}
		
	}
}
