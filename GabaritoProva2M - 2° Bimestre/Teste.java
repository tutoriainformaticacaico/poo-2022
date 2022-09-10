/* 
 * 1- Considere as classes com os seguintes atributos: Gerente, que tem como atributo departamento; 
 * Empregado, que tem como atributo nome e salário; Vendedor, que tem como atributo o percentual de comissão.
 * 
A classe Empregado deve possuir dois atributos, nome e salario. Salario deve ser do tipo protected. 
Crie os métodos get e set para classes e o método toString. (20 pontos)

As classes Gerente deve herdar da classe Empregado. Crie os métodos get e set para a classe e o método toString. 
O método toString da classe Gerente deve incluir a informação do departamento, além dos dados da superclasse.(20 pontos)
A classe Vendedor deve herdar também da classe Empregado. Deve possuir ainda um método denominado calcularSalario. 
Esse método deve retornar um valor do tipo float, correspondente ao valor do salário acrescido do respectivo 
percentual de comissão. O método toString da classe deve apresentar as informações de nome do empregado, 
salário sem comissão, salario com comissão e percentual de comissão. (40 pontos)
Crie uma classe para testar objetos das classes implementadas.(20 pontos)
 */

public class Teste{
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Vendedor v = new Vendedor();

        //preenchendo informações do gerente
        g.setNome("Fabio");
        g.setDepartamento("Alimenticio");
        g.salario = 1500.00;

        //preenchendo informações do vendedor
        v.setNome("Mario");
        v.salario = 1500.00;
        v.setPercentualComi(0.15);

        //exibindo informações do gerente
        System.out.println("-----Gerente-----");
        System.out.println(g);
        System.out.println("\n-----Vendedor-----");
        //exibindo informações do vendedor
        System.out.println(v);





    }
}