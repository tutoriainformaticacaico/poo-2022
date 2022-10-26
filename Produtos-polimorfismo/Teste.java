/* 
 * --------------Explicacao do codigo-----------
 */

import java.util.*;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> p = new ArrayList<Produto>();
        Livro l = new Livro("vinte mil leguas submarinas");
        Mouse m = new Mouse("mouse gamer acer nitro X");

        System.out.println("-------Sisteminha bacana----------");
        boolean end = false;
        int resp = 0;

        while(end != true){
            boolean auxi = false;

            while(auxi != true){
                System.out.println("Bem vindo(a)!!!, o que deseja comprar???");
                System.out.println("1.Livro\n2.Mouse\n3.finalizar");
                resp = sc.nextInt();

                if (resp == 1) {
                    System.out.println("------Livro-------");
                    sc.nextLine();
                    System.out.println("Digite a descricao do livro");
                    l.setDescricao(sc.nextLine());
                    System.out.println("Digite o autor do livro");
                    l.setAutor(sc.nextLine());
                    
                    p.add(new Livro(l));
                    auxi = true;
                }else if(resp == 2){
                    System.out.println("------Mouse-------");
                    sc.nextLine();
                    System.out.println("Digite o tipo do mouse\n1.Basico\n2.Gamer");
                    m.setTipo(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Digite a descricao do Mouse");
                    m.setDescricao(sc.nextLine());

                    p.add(new Mouse(m));
                    auxi = true;
                }else if(resp == 3){
                    sc.nextLine();
                    System.out.println("-----Finalizando----");
                    System.exit(0);

                }else{
                    System.out.println("Digite um numero válido...");
                    auxi = false;
                }
            }

            System.out.println("Deseja efetuar outra compra???\n1.sim\n2.nao");
            resp = sc.nextInt();

            if (resp == 1) {
                end = false;
            }else{
                end = true;
            }

        }

        System.out.println("------Compras efetuadas------");
        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i));
        }


    }
 }