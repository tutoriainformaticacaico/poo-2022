/* 
 * 1 - (Valor 50 pontos) Implemente a hierarquia de classes ContaBancaria (superclasse), 
 * ContaCorrente (com senha, número, saldo e quantidade de transações realizadas) e 
 * ContaPoupanca (com senha, número, saldo e taxa de rendimento).
 * 
-quando uma ContaBancaria for criada, informe a senha da conta por parâmetro.
-na classe ContaBancaria, crie os seguintes métodos abstratos: saca(double valor)deposita(double valor) tiraExtrato()
-nesta mesma classe, crie o método alteraSenha, que recebe uma senha por parâmetro e deve confirmar a senha anterior (via teclado), 
e somente se a senha anterior estiver correta a senha recebida por parâmetro deve ser atribuída.

-implemente os métodos abstratos nas classes ContaCorrente e ContaPoupanca.• 
crie os métodos de acesso para os atributos de ContaCorrente e ContaPoupanca.

2-  (Valor 50 pontos) Crie uma classe de teste para testar a hierarquia do exercício acima.
pergunte (via teclado) quantas contas o usuário deseja criar e crie-as (com a utilização de arrays para armazenar as contas.
a cada conta criada, pergunte ao usuário se trata-se de uma ContaCorrente ou de uma ContaPoupanca, e crie a conta de acordo com o informado pelo usuário.
após as contas terem sido criadas, informe a taxa de rendimento de cada ContaPoupanca armazenada.
realize saques, depósitos e extratos nestas contas.
imprima a quantidade de transações realizadas nas contas correntes e as taxas de rendimento das contas poupança.
 */

import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Trabalho 3° bimestre - ContaBancaria -----------\n");
        System.out.println("Quantas contas deseja criar?\n\nOBS: Uma senha devera ser informada para conta criada");
        int count = sc.nextInt();
        String senhas;

        ContaBancaria contas[] = new ContaBancaria[count];

        for (int i = 0; i < contas.length; i++) {
            System.out.println("Digite o tipo da "+(i+1)+"° Conta bancaria\n1.Poupança\n2.Corrente");
            count = sc.nextInt();

            if (count == 1) {
                sc.nextLine();
                System.out.println("Digite a senha da "+(i+1)+"° Conta bancaria");
                senhas = sc.nextLine();
                contas[i] = new ContaPoupanca(senhas);
                
            }else if(count == 2){
                sc.nextLine();
                System.out.println("Digite a senha da "+(i+1)+"° Conta bancaria");
                senhas = sc.nextLine();
                contas[i] = new ContaCorrente(senhas);
            }
        }
        System.out.println("\n--------Conta--------\n");
        System.out.println("Digite a senha da conta que deseja acessar");
        senhas = sc.nextLine();
        for (int i = 0; i < contas.length; i++) {
            if (senhas.equals(contas[i].getSenha())) {
                contas[i].depositar(200);
                contas[i].sacar(50);
                contas[i].depositar(75);
                contas[i].sacar(32);
                
                System.out.println(contas[i].toString()+"\n");
                contas[i].tiraExtrato();
                break;
            }
        }

        System.out.println("-----Este programa esta com uma execucao unica apenas para meios academicos-----");

    }
}