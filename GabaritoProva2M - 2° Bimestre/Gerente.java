public class Gerente extends Empregado{
    private String departamento;

    public String toString(){
        return "Nome: "+getNome()+
        "\nSalario: "+salario+
        "\nDepartamento: "+departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
