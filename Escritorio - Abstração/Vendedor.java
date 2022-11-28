public class Vendedor extends Funcionario{

    private double comissao;

    public Vendedor(double comissao){
        this.comissao = comissao;
        calculaSalario();
    }

    @Override
    public double calculaSalario() {
        salarioBase += comissao;
        return salarioBase;
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
