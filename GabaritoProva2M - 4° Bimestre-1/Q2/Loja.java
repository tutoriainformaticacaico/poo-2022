/* 
 * 2- (50 pontos) Crie uma hierarquia de classes de domínio para uma loja que venda livros, CDs e DVDs. 
 * Sobrescreva o método toString() para que imprima:
Para livros: nome, preço e autor;
Para CDs: nome, preço e número de faixas;
Para DVDs: nome, preço e duração.Evite ao máximo repetição de código utilizando a 
palavra super no construtor e no método sobrescrito. Em seguida, crie uma classe Loja com o 
método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor e, por fim, imprima 
o conteúdo do vetor.
 */
public class Loja {
    public static void main(String[] args) {
        Produtos produtos[] = new Produtos[5];

        System.out.println("-------Gabarito prova 4° bimestre 2M---------");
        //Criando alguns objetos aleatórios já previamente preenchidos
        //ps: isso servirá para que a exibição se torne mais intuitiva
        produtos[0] = new Livro("Frankenstein", 29.99, "Nao lembro kskssk");
        produtos[1] = new Livro("A ilha perdida", 229.99, "Rapazzz");
        produtos[2] = new DVD("Contos do glau dos lei", 69.99, 9.50);
        produtos[3] = new DVD("the batman com o batman", 1.99, 13.8);
        produtos[4] = new CD("Bob sponja, trilha sonora 5", 229.99, 12);

        //ps: vale ressaltar que se o usuario fosse preencher as informações dos produtos
        //a utilização de um for seria INDISPENSAVEL

        //utilizando do toString, basta que chamemo-o aqui, onde dessa forma, com apenas
        //uma linha, todas as informações serão imprimidas
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("================================");
            System.out.println(produtos[i].toString());
        }
        System.out.println("================================");
        //esse sysout serve só pra ficar bunitinn
    }
}
