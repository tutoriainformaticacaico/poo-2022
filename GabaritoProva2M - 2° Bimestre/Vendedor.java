public class Vendedor extends Empregado{
    private double percentualComi;

    public String toString(){
        return "Nome: "+getNome()+
        "\nSalario: "+salario+
        "\nSalario Comissao: "+calcularSalario()+
        "\nComissao: "+(percentualComi*100)+"%";
    }

    public double calcularSalario(){
        return (salario + (salario*percentualComi));
    }

    public double getPercentualComi() {
        return percentualComi;
    }
    public void setPercentualComi(double percentualComi) {
        this.percentualComi = percentualComi;
    }

}
