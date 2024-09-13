package V01day1907;

import java.io.Serializable;

public class ContaCorrente extends Conta1 implements Serializable {
    private static final long serialVersionUID = 1L; // Identificador de versão serial

    private float limite;

    public ContaCorrente(String titular, String senha, float limite) {
        super(titular, senha);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor){
        if (saldo + limite >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String verificaSaldo(){
        String retorno = String.format("Seu saldo atual é de R$%.2f\n", saldo);
        if (saldo >= 0)
            retorno += String.format("Limite disponível R$%.2f", limite);
        else
            retorno += String.format("Limite disponível R$%.2f", limite + saldo);
        return retorno;
    }

	public boolean validaAcesso1(String identificadorCC, String senhaCC) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validaAcesso(String identificadorCC, String senhaCC) {
		// TODO Auto-generated method stub
		return false;
	}
}