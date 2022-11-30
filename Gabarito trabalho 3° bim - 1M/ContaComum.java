public class ContaComum {
    private String titular;
    private String numConta;
    private double saldo;

    public void abertura(double valor){
        this.saldo = valor;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        if (valor<=saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso\n");
        }else{
            System.out.println("Saldo insuficiente!!\n");
        }
    }

    public void VerificaSaldo(){
        System.out.println("Seu saldo atual eh de: "+ saldo+" R$\n");
    }
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
