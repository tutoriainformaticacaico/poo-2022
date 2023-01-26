/* 
 * 1- (50 pontos) Crie a seguinte hierarquia de classes abaixo:
Uma interface para representar qualquer forma geométrica, definindo métodos para cálculo do perímetro e cálculo da área da forma;
Uma classe abstrata para representar quadriláteros. Seu construtor deve receber os tamanhos dos 4 lados e o método de cálculo do perímetro já pode ser implementado;
Classes para representar retângulos e quadrados. A primeira deve receber o tamanho da base e da altura no construtor, enquanto a segunda deve receber apenas o tamanho do lado;
Uma classe para representar um círculo. Seu construtor deve receber o tamanho do raio.
Uma classe para o programa principal, pergunte ao usuário quantas formas ele deseja criar. 
Em seguida, para cada forma, pergunte se deseja criar um quadrado, um retângulos ou um círculo, 
solicitando os dados necessários para criar a forma. Todas as formas criadas devem ser armazenadas 
em um vetor. Finalmente, imprima: (a) os dados (lados ou raio); (b) os perímetros; e (c) as áreas de 
todas as formas. Para (b) e (c), tire vantagem do polimorfismo.

Notas de Tutor:
    Código feito por Jefferson, se vc for jefferson, saiba que eu achei seu código bem feito até.
E assim como eu já havia comentado, se poupou tempo não usando tanto o Scanner. Mas vale ressaltar
que se fosse um projeto ou algo do tipo, o mesmo n deveria ser feito. A menos que fosse pra preencher o banco.
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Gabarito Prova 1M - 4° Bimestre------------");

        System.out.println("Quantas formas deseja criar?");
        int quantidade = sc.nextInt();

        //incializando uma interface f para guardar todos os objetos
        FormaGeometrica formas[] = new FormaGeometrica[quantidade];

        //dependendo da escolha do usuario um novo objeto sera gerado
        for (int i = 0; i < formas.length; i++) {
            System.out.println("O que deseja criar?\n1-Quadrado\n2-Retangulo\n3-Circulo");
            int resp = sc.nextInt();
            if (resp == 1) {
                //Preenchendo os dados de forma manual pra poupar tempo
                formas[i] = new Quadrados(4, 4, 4, 4, 4);
            }else if(resp == 2){
                //Preenchendo os dados de forma manual pra poupar tempo
                formas[i] = new Retangulos(4, 5, 4, 5, 8, 5);
            }else if(resp == 3){
                //Preenchendo os dados de forma manual pra poupar tempo
                formas[i] = new Circulo(6);
            }
        }

        //imprimindo tudo
        for (int i = 0; i < formas.length; i++) {
            System.out.println("----------------------------");
            System.out.println(formas[i].toString());
        }
        System.out.println("----------------------------");

        System.out.println("Made by Jefferson");
    }
}
