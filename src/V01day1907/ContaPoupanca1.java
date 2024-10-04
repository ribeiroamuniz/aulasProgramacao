package V01day1907;
import java.io.Serializable;

public class ContaPoupanca1 extends Conta1 implements Serializable {
    private static final long serialVersionUID = 1L; 

    public ContaPoupanca1(String titular, String senha) {
        super(titular, senha);
    }

    public void ContaPoupanca(String titular, String senha) {
		// TODO Auto-generated constructor stub
	}

    public boolean sacar(float valor){
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String verificaSaldo(){
        return String.format("Seu saldo atual é de R$%.2f", saldo);
    }
}