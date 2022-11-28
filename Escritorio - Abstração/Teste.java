/* 
 * 1- Crie uma hierarquia de classes para representar os 
 * diferentes tipos de funcionários de um escritório que tem os 
 * seguintes cargos: gerente, assistente, vendedor. Escreva uma classe 
 * base abstrata chamada Funcionario que declara um método abstrato:

Assinatura double calculaSalario()

Esta classe também deve definir os seguintes 
atributos: nome (tipo String), matricula (tipo String) e 
salario_base (tipo double). Use encapsulamento e forneça um 
construtor que recebe os valores correspondentes a serem 
armazenados nos respectivos atributos. Esta classe abstrata 
deverá ser estendida pelas outras classes representativas dos tipos de 
funcionários,portanto devem ser escritas as classes Gerente, Assistente e Vendedor. 
Em cada classe deve-se sobrescrever o método calculaSalario 
de forma que cálculo do salário é feito assim: O gerente recebe 
duas vezes o salário_base, o assistente recebe o salário_base e o 
vendedor recebe o salário_base mais uma comissão definida no construtor 
de sua classe. Crie uma classe Teste com um método main que cria um objeto 
de cada tipo e os armazena em uma lista e depois calcula a folha salarial 
dos três funcionários e imprime o valor total. Indique quais conceitos de 
POO você usou e como foi usado.
 */

import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vendedor v = new Vendedor(50);
        Gerente g  = new Gerente();
        Assistente a = new Assistente();

        Funcionario f[] = new Funcionario[3];

        f[0] = v;
        f[1] = g;
        f[2] = a;

        double total = 0;

        for (int i = 0; i < f.length; i++) {
            total += f[i].getSalarioBase();
        }

        System.out.println("O total de salarios da: "+total);

       


    }
}