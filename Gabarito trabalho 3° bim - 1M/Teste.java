/* 
 * 1 - (Valor 50 pontos)
Definir uma classe ContaComum com os atributos, Número da Conta, Saldo e Titular e as operações: Abertura (recebe o depósito inicial), Depósito, Saque e VerificaSaldo.
Definir a classe ContaEspecial, descendente de ContaComum, com o atributo de limite. Redefinir as operações de Abertura e Saque.
Definir a classe ContaPoupanca, descendente de ContaComum. Implementar a operação Rendimento (escola uma taxa de juros para rendimentos da poupança).
2-  (Valor 50 pontos)
Crie uma classe de teste para testar a hierarquia do exercício acima.
pergunte (via teclado) quantas contas o usuário deseja criar e crie-as (com a utilização de vetores para armazenar as contas.
a cada conta criada, pergunte ao usuário se trata-se de
uma ContaEspecial, ContaComum ou ContaPoupanca, e crie a conta de acordo com o
informado pelo usuário.
teste todas as operações possíveis em cada tipo de conta.

-------Notas de gabarito---------

    Note que por ser uma mãe, estarei utilizando de contaComum para guardar
    todos os tipos de conta. (Polimorfismo)

    Perceba que a utlização de abstração em todos os quesitos foi dispensada. Isso
    ocorreu porque a forma que eu montei as classes, a utilização de abstração veio a 
    ser desnecessaria. Porem, se requisitado, uma forma utilizando de abstração será enviada
    ^^

    ps: Vale ressaltar que dessa forma atual, nao conseguiremos acessar o metodo "calcularRendimento()" da
    classe contaPoupaca. Isso ocorre porque uma mãe consegue apenas guardar informações(atributos) das filhas
    e metodos de mesmo nome, isto eh, metodos que foram reescritos ou que herdaram da mãe

 */

import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Gabarito trabalho 3° bim 1M-------\n");

        System.out.println("Digite quantas contas deseja criar");
        int quantidade = sc.nextInt();

        int auxi;//Variavel auxiliar que recebera as respostas do usuario ao longo do laço for
        double valor;//Auxiliar de valores de deposito no laço for

        ContaComum contas[] = new ContaComum[quantidade];

        //Esse for vai servir para escolhermos o tipo de cada conta
        for (int i = 0; i < contas.length; i++) {
            valor = 0;
            //sempre que o laco voltar para o começo, valor começara com 0, isso nos ajudara a 
            //definir como 0 o saldo inicial do usuario caso ele n queira fazer um deposito

            System.out.println("Digite o tipo da "+(i+1)+"° Conta:\n1.Comum\n2.Especial\n3.Poupanca");
            auxi = sc.nextInt();

            //Dependendo da escolha do usuario, a posição recebera um objeto diferente
            if (auxi == 1) {
                contas[i] = new ContaComum();
                System.out.println("Um deposito inicial pode ser realizado, caso queira, insira o valor do deposito");
                valor = sc.nextDouble();
                contas[i].abertura(valor);
            }else if(auxi == 2){
                contas[i] = new ContaEspecial();
                System.out.println("Um deposito inicial pode ser realizado, caso queira, insira o valor do deposito");
                valor = sc.nextDouble();
                contas[i].abertura(valor);
            }else if(auxi == 3){
                contas[i] = new ContaPoupanca();
                System.out.println("Um deposito inicial pode ser realizado, caso queira, insira o valor do deposito");
                valor = sc.nextDouble();
                contas[i].abertura(valor);
            }else{
                System.out.println("Numero invalido, a conta "+(i+1)+"° recebera valor de uma conta Comum");
            }
        }

        //Testando as contas criadas-----------
        //O parametro getClass() retornara prefixo class seguido do nome da classe a qual foi gerado o objeto. 
        //utilizando do getName(), podemos retornar apenas o nome da classe, facilitando um teste logico com o msm
        System.out.println("\nVoce criou um total de "+quantidade+" Contas.\nAlguns depositos e saques serao realizados de forma automatica para fins de teste");
        for (int i = 0; i < contas.length; i++) {
            //Dependendo do tipo do objeto realizarei uma operacao em especifica
            if (contas[i].getClass().getName().equals("ContaComum")) {
                contas[i].deposito(600);
                contas[i].saque(200);
            }else if(contas[i].getClass().getName().equals("ContaEspecial")){
                contas[i].deposito(890);
                contas[i].saque(1000);
            }else if(contas[i].getClass().getName().equals("ContaPoupanca")){
                contas[i].deposito(300);
                contas[i].saque(100);
            }
        }

        //Exibindo o saldo final de todas as contas
        for (int i = 0; i < contas.length; i++) {
            System.out.println("O saldo da "+(i+1)+"° Conta eh:");
            contas[i].VerificaSaldo();
        }

    }
}