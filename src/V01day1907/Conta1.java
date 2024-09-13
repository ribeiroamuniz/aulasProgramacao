package V01day1907;

import java.util.Random;

public class Conta1 {
	private String titular;
	private String identificador;
	private String senha;
	protected float saldo;

	public Conta1(String titular, String senha){
		this.titular = titular;
		this.senha = senha;
		geraIdentificador();
	}

	public void Conta(String titular2, String senha2) {
	}

	public String getTitular(){
		return titular;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}

	public String getIdentificador(){
		return identificador;
	}

	public void setSenha(String senha){
		this.senha = senha;
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	private void geraIdentificador(){
		String id = "";
		Random aleatorio = new Random();
		for(int i=0;i<4;i++){
			id+=(char)aleatorio.nextInt(65,90);
		}
		id+=aleatorio.nextInt(1000,2000);
		identificador = id;
	}

	public boolean validaAcesso(String identificador, String senha){
		return this.identificador.equals(identificador) && this.senha.equals(senha);
	}

	public String verificaSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean sacar(float valor) {
		// TODO Auto-generated method stub
		return false;
	}
}