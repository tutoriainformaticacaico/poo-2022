/* 
 *  Faça um sistema que permita fazer o controle do estoque de produtos de um supermercado, 
 * permitindo que gerentes adicionem produtos ao estoque e que funcionários realizem a 
 * vendas de produtos, fazendo baixa do estoque. O sistema deve informar o valor total da 
 * venda e a descrição de cada produto vendido, bem como a quantidade de cada produto. 
 * Além disso, o sistema deve permitir o gerente emitir relatório de vendas de acordo 
 * com o período especificado.
 * 
 * 
 * ------Notas do programador--------
 *      O codigo está todo comentado e explicando o que cada coisa faz, a lógica em si não foi explicada, 
 * pois a mesma se assemelha a questões anteriores já feitas.
 * 
 * O codigo se encontra parcialmente completo, visto que o Funcionario ainda não está sendo diretamente utilizado
 * um sistema curto de login poderia ser feito para resolver tal feito. Fiquem avontade para tenta-lo fazer
 * ou pedir que eu o faça futuramente.
 * 
 * ps: essa eh uma das formas de resolver essa questão, existem outras MILHARES de forma. O objetivo desse gabarito
 * eh mostrar uma lógica organizada de se fazer. Se ainda não tentou por si só resolver a questão, recomendo que
 * não visualize este gabarito, pois irá suprir sua inspiração propia de código :).
 *  
 */

import java.util.*;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        int auxi;//auxiliar de coleta de numeros inteiros
        boolean programa = true;//boolean que controla quando o programa encerra

        System.out.println("----Gabarito----\n");
        while(programa){//permitirá que o programa só encerre quando o usuario quiser
            System.out.println("-------Mercadinho inho inho------");
            System.out.println("O que deseja fazer?\n1.Realizar Venda\n2.Gerenciar Vendas\n3.Cadastrar produto\n4.sair");
            auxi = sc.nextInt();
            if (auxi == 1) {
                //Ação de um vendedor
                System.out.println("------Vendedor-------");
                sistema.exibir();
                System.out.println("Digite o codigo do produto a ser comprado");
                int codigo = sc.nextInt();
                System.out.println("Digite a quantidade do produto a ser adicionada");
                int quantidade = sc.nextInt();

                sistema.realizarVenda(codigo, quantidade);
                
            }else if(auxi == 2){
                //Ação de um gerente
                System.out.println("---Ação de um gerente---\nAguardando senha:");
                auxi = sc.nextInt();
                if (sistema.credencial(auxi)) {//verificando a senha digitada
                    System.out.println("-----Vendas efetuadas------\n");
                    sistema.exibirVendas();
                }else{
                    System.out.println("Senha invalida");
                }
                
            }else if(auxi == 3){
                //Ação de um gerente
                System.out.println("---Ação de um gerente---\nAguardando senha:");
                auxi = sc.nextInt();
                sc.nextLine();//Limpando buffer
                if (sistema.credencial(auxi)) {//verificando a senha digitada
                    System.out.println("----Cadastro de Produto----\n");
                    System.out.println("Digite o nome do produto");
                    String nome = sc.nextLine();
                    System.out.println("Digite o preco do produto");
                    double preco = sc.nextDouble();
                    System.out.println("Digite a quantidade a ser adicionada");
                    int quantidade = sc.nextInt();

                    sistema.cadastrarProduto(nome, preco, quantidade);

                }else{
                    System.out.println("Senha invalida");
                }

            }else if(auxi == 4){
                //encerra o programa
                programa = false;
                break;
            }else{
                System.out.println("Numero invalido");
            }

        }

    }
}