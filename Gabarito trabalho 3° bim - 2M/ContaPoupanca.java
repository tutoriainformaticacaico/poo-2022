public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(final String senha){
        super(senha);//chama o construtor 1
        this.taxaRendimento = 0.05;
    }

    public String toString(){
        return "Tipo: Conta Poupanca"+
               "\nSaldo: "+saldo+
               "\nTaxaRen: "+taxaRendimento;
    }

    @Override
    public void depositar(double deposito) {
        this.saldo += deposito;
        System.out.println("deposito realizado com sucesso!!!");

        extratos[count] = "Deposito: "+deposito+", Data: tal do tal";
        count++;
    }
    @Override
    public void sacar(double saque) {
        if (saque <= this.saldo) {
            this.saldo -= saque;
            System.out.println("saque realizado com sucesso!!!");
        }else{
            System.out.println("Saldo insuficiente!!!");
        }
        
        extratos[count] = "Saque: "+saque+", Data: tal do tal";
        count++;
    }
    @Override
    public void tiraExtrato() {
        System.out.println("-------Extrato--------");
        for (int i = 0; i < extratos.length; i++) {
            if (extratos[i] != null) {
                System.out.println(extratos[i]);
            }
        }
        
    }


    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(final double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

}
