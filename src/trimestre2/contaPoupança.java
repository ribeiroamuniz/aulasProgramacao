package trimestre2;
public class contaPoupança extends ContaBancaria{
    public contaPoupança(String titular, String senha, float deposito){
        super(titular, senha);
        saldo = deposito;
    }
    public boolean sacar(float valor){
        if (valor <= saldo) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    public String verificar(){return String.format("Saldo: R$%.2f", saldo);}
}