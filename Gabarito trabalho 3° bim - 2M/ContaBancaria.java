public abstract class ContaBancaria {
    protected String senha;
    protected String numero;
    protected double saldo;
    protected String extratos[] = new String[100];
    protected int count;

    //Construtor 1
    public ContaBancaria(String senha){
        this.senha = senha;
        count = 0;
    }

    public abstract void sacar(double deposito);
    public abstract void depositar(double saque);
    public abstract void tiraExtrato();

    public void alteraSenha(String senha){
        if (this.senha.equals(senha)) {
            this.senha = senha;
        }else{
            System.out.println("Senha incorreta!!!");
        }
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
