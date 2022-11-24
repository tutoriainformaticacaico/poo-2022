/* 1- Faça um sistema que permita fazer o controle do estoque de produtos 
de um supermercado, permitindo que gerentes adicionem produtos ao estoque 
e que funcionários realizem a vendas de produtos, fazendo baixa do estoque. 
O sistema deve informar o valor total da venda e a descrição de cada produto 
vendido, bem como a quantidade de cada produto. Além disso, o sistema deve 
permitir o gerente emitir relatório de vendas de acordo com o período especificado. */
import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco b = new Banco();

        boolean finalizar = false;
        int aux = 0;

        while(finalizar != true){
            System.out.println("O que deseja fazer???? \n1.Cadastrar\n2.Vender algo\n3.Sair");

            aux = sc.nextInt();

            if (aux == 1) {
                System.out.println("Digite o nome do produto");
                String nome = sc.nextLine();
                System.out.println("Digite o codigo do produto");
                int codigo = sc.nextInt();
                System.out.println("Digite o preco");
                double preco = sc.nextDouble();
                System.out.println("Digite a quantidade");
                int quantidade = sc.nextInt();
                b.cadastrarProduto(nome, preco, quantidade, codigo);
            }else if(aux == 2){
                System.out.println("------Caixa-------");
                System.out.println("Digite o codigo do produto que deseja comprar");
                int codigo = sc.nextInt();
                System.out.println("Digite a quantidade que vai ser comrpada");
                int quantidade = sc.nextInt();
                b.realizarVenda(codigo, quantidade);
            }else if(aux == 3){
                System.out.println("----------Produtos cadastrados-------------");
                b.exibirProdutos();

                sc.nextLine();
                

                System.out.println("------Vendas efetuadas---------");
                b.exibirVendas();

                b.exibirProdutos();
            }
            

        }

           

            


        

    }
}