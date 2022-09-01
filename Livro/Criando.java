/* 
 * Explicação no arquivo ClasseLivro
 */

import java.util.Scanner;

public class Criando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClasseAutor machadao = new ClasseAutor();
        ClasseEditora editora1 = new ClasseEditora();
        ClasseLivro livro1 = new ClasseLivro();


        System.out.println("Insira o nome do autor:");
        machadao.setNome(sc.nextLine());

        System.out.println("Informe a data de nascimento do autor:");
        machadao.setNascimento(sc.nextLine());

        System.out.println("Digite seu cpf:");
        machadao.setCpf(sc.nextLine());

        System.out.println("Nome da sua rua:");
        machadao.setEndereço(sc.nextLine());

        // -------------------------------------------------------------------------------------------------------------------------

        // Primeiro livro:
        
        livro1.editora = editora1;
        livro1.autor = machadao;

        System.out.println("Insira o ISBN do livro:");
        livro1.setISBN(sc.nextLine());
        
        System.out.println("Insira o nome do livro:");
        livro1.setNome(sc.nextLine());
        
        System.out.println("Insira o ano de lancamento:");
        livro1.setAno(sc.nextInt());
        sc.nextLine();

    }
}
