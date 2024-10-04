package day1204.ArqObjeto;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String sobrenome;
	
	@Override
	
	public String toString() {
		return "nome: "+nome+"\n sobrenome: "+sobrenome;
	}
}
