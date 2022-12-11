/* 
 * 1- (20 pontos) Crie uma classe chamada Pessoa. Uma pessoa possui um nome e uma idade.
crie 2 construtores: 1 que recebe o nome e a idade como parâmetros de entrada e um que não 
recebe parâmetros e inicializa os atributos com um valor padrão (“indefinido” para Strings e 0 para inteiros).
crie os métodos de acesso para os atributos (GET e SET).

2 -  (20 pontos ) Crie uma classe Amigo, que herda Pessoa, e possui uma data
de aniversário.
crie um construtor que não recebe parâmetros de entrada, e inicializa o
atributo com um valor padrão (“indefinido”, por exemplo).
crie os métodos de acesso para o atributo data de nascimento.

3 - (20 pontos) Crie uma classe Conhecido, que herda Pessoa, e possui um e-mail.
crie um construtor que não recebe parâmetros de entrada, e inicializa o e-mail com 
um valor padrão (“indefinido”, por exemplo).
crie os métodos de acesso para este atributo.

4- (40 pontos) Crie agora, uma classe Agenda, que possui pessoas (em um vetor) e dois 
atributos que controlam: a quantidade de amigos e a quantidade de conhecidos.

crie um construtor que recebe por parâmetro a quantidade de pessoas que a agenda terá, 
e inicializa o vetor de Pessoa. Neste construtor, inicialize todas as posições do vetor 
criando ALEATORIAMENTE um Conhecido ou um Amigo (utilize o comando: 1+(int)(Math.random()*2) 
para sortear valores entre 1 e 2. Se o valor encontrado for 1, crie um Amigo. 
Se o valor encontrado for 2, crie um Conhecido).

crie os métodos GET e SET para todos os atributos da classe Agenda.
crie um método chamado addInformacoes, que não recebe parâmetros de entrada. 
Para cada Pessoa na agenda, peça para o usuário digitar (via teclado) as informações 
cabíveis para cada tipo de Pessoa, e acesse os métodos SET para atribuir as informações.

crie um método chamado imprime Aniversários, que imprime os aniversários de todos os amigos 
que estão armazenados na agenda.

crie um método chamado imprime Email, que imprime os e-mails de todos os conhecidos 
que estão armazenados na agenda.

5- (Questão Extra - vale 10 pontos, ou seja, 10 de 100 ) Crie uma classe de teste para a Agenda.
peça para o usuário informar (via teclado) quantas pessoas ele deseja colocar na agenda, 
e crie uma Agenda com esta informação.
imprima na tela a quantidade de amigos e de conhecidos na agenda.
adicione informações à agenda.
imprima todos os aniversários dos amigos presentes na agenda.
imprima todos os e-mails dos conhecidos armazenados na agenda.
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------Gabarito prova 1M - 3° bimestre----------\n");
        System.out.println("Digite quantas pessoas deseja criar:");
        int quantidade = sc.nextInt();

        //criando a quantidade de pessoas que o usuario informou
        Agenda agenda = new Agenda(quantidade);
        int tipo = 0;//auxiliar informante de tipo para o metodo addInformacoes
        System.out.println("\nVoce possui:\n"+agenda.getQuantAmigos()+" Amigos\n"+agenda.getQuantConhecidos()+" conhecidos\n");

        System.out.println("Seguindo para o preenchimento de informacoes...");
        for (int i = 0; i < agenda.getPessoas().length; i++) {
            tipo = 0;
            sc.nextLine();
            if (agenda.getPessoa(i).getClass().getName().equals("Amigo")) {
                tipo = 1;
                System.out.println("Amigo n"+(i+1)+"°");
                System.out.println("Digite o nome:");
                String nome = sc.nextLine();
                System.out.println("Digite o Aniversario:");
                String email = sc.nextLine();
                System.out.println("Digite a idade:");
                int idade = sc.nextInt();
                agenda.addInformacoes(nome, idade, email, tipo, i);
                
            }else{
                tipo = 2;
                System.out.println("Conhecido n"+(i+1)+"°");
                System.out.println("Digite o nome:");
                String nome = sc.nextLine();
                System.out.println("Digite o Email:");
                String aniversario = sc.nextLine();
                System.out.println("Digite a idade:");
                int idade = sc.nextInt();
                agenda.addInformacoes(nome, idade, aniversario, tipo, i);
            }
        }

        System.out.println("-------Amigos------");
        agenda.imprimeAniversarios();
        System.out.println("\n-------Conhecidos--------");
        agenda.imprimeEmails();


    }
}