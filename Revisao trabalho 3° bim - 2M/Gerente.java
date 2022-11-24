public class Gerente extends Funcionario{

    public Gerente(){
        calculaSalario();
    }

    @Override
    public double calculaSalario() {
        salarioBase = salarioBase * 2;
        return salarioBase;
    }
    
}
