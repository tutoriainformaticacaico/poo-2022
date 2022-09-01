/*Questão 1- Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.

-----Conceitos utilizados-----
    *Vetor
    *Objetos
    *vetor de objetos
    *laço de repetição (for)
    *funções

------Notas gerais------
    Bem, a começar, para resolver essa questão eu recomendo que utilize de um indice
de vetor baixo (como 3) para realizar os testes, adiante, tambem recomendo que tente fazer a 
questão de forma estruturada, depois, transforme as operações em funções, vai tornar o entendimento
do mesmo mais fácil.

-----Desafio extra------
    voces podem tentar fazer 2 coisas para exercitar ainda mais a criatividade em gambiarras e habilidade em programação:
        1° - tornar esse programa 'infinito', isto eh, só encerrar se o usuario desejar
        2° - utilizar de um Random para preencher todas as informações, para depois apenas escolher o que fazer

Notas finais:
Gatos são seres cósmicos ^..^

PS: junto desse arquivo, estarei enviando um outro utilizando de arraylist para facilitar MAIS AINDA a vida, não estara
comentado, mas não hesitem em pesquisar sobre ArrayList para entende-lo, vai ser muito util
*/
import java.util.*;

public class Desafio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Aqui, nos inicializamos um vetor do tipo 'Agenda', na qual contem 10 posições.
        Agenda[] agenda = new Agenda[3];

        for(int i = 0; i<3; i++){
            //Com isso, fazemos com que cada posição do vetor receba o conteudo da classe, ou seja,
            //receba os atributos, metodos..... contidos na classe Agenda
            agenda[i] = new Agenda();
        }

        //Esse for serve para preencher as informações de cada objeto, vale lembrar que por se tratar
        //de um vetor de objeto, agenda[1] eh totalmente diferente de agenda[2], são 'agendas' diferentes, ou
        //seja, merecem atenção e são coletados de forma separada.
        for(int i= 0; i<3; i++){
            System.out.println("Digite o nome da "+(i+1)+"° Pessoa");
            agenda[i].nome = sc.nextLine();
            System.out.println("Digite a idade da "+(i+1)+"° Pessoa");
            agenda[i].idade = sc.nextInt();
            System.out.println("Digite a altura da "+(i+1)+"° Pessoa");
            agenda[i].altura = sc.nextDouble();
            //Limpando o buffer do Mano Scanner, lembra que quando se coleta numero e depois tenta coletar texto
            //da ruim?, então, dizemos que o buffer ficou 'sujo', para limpar, basta reseta-lo, com esse comando abaixo
            sc.nextLine();
        }

        //Aqui chamamos esse mano exibir, a explicação vai ficar laaaa embaixo
        exibir(agenda);

        //Aqui, pedimos ao usuario que digite o nome de uma pessoa da qual deseja remover do banco
        System.out.println("Digite qual pessoa deseja remover");
        String nome = sc.nextLine();

        //veja que novamente, utilizamos do vetor do nosso objeto como parametro, isso facilita e MUITO nossa vida
        //e que utilizamos de um retorno para atualizar nosso vetor de objeto
        agenda = removerPessoa(agenda, nome);

        //chamando novamente o MANO exibir, isso serve para mostrar ao usuario que a pessoa REALMENTE foi apagada
        exibir(agenda);

        //Aqui, pedimos um indice na qual queremos visualizar
        System.out.println("Deseja imprimir os dados de qual indice?");
        int index = sc.nextInt();

        //perceba que novamente, utilizamos do vetor como parametro, onde repito novamente, FACILITA PRA ZORRA nossa vida
        //veja que no index utilizo de um -1, isso serve para que a posição informada fique coerente com a posição do vetor
        exibirPessoa(agenda, index-1);

        //aqui, limpamos o nosso buffer, já que estamos prestes a coletar um String, e anteriormente coletamos um numero
        sc.nextLine();
        //Pedindo pro mano usuario digitar o nome da pessoa da qual deseja ver o indice
        System.out.println("Deseja ver o indice de qual pessoa???");
        nome = sc.nextLine();

        //Por fim, passamos de novo, nosso vetor como parametro, pq repito, FACILITA NOSSA VIDA PRA ZORRA²
        exibirIndice(agenda, nome);

    }
    //Esse eh uma das funções que a questão nos pede, perceba que eh possivel passar um vetor como parametro,
    //e mais ainda eh possivel passar um objeto como parametro, E INDO MAIS FUNDO, eh possivel passar um vetor
    //de objeto como parametro, dessa forma, podemos tratar do objeto dentro de nossa função, como se estivessemos
    //trabalhando no main, então utilizamos de um for para imprimir cada posição
    //Perceba que possui um IF para checar se a posição está vazia, se isso ocorrer, o mesmo não será exibido,
    //isso serve para que após 'apagarmos' uma posição, a mesma não seja exibida contendo tudo vazio
    //ps: o contador serve só para fins de msg, para ele ordenar as pessoas exibidas
    static void exibir(Agenda[] agenda){
        int contador = 1;
        for(int i = 0; i<3; i++){
            if(agenda[i].nome.equals("")){
            }else{
                System.out.println("----------Informações da "+contador+"° Pessoa-------------");
                System.out.println("Nome: "+agenda[i].nome);
                System.out.println("idade: "+agenda[i].idade);
                System.out.println("altura: "+agenda[i].altura);
                contador++;
            }
            
        }
    }

    //A logica eh simples, pesquisamos no nosso vetor em que posição se encontra o nome informado, e depois exibimos com 
    //uma mensagem
    static void exibirIndice(Agenda[] agenda, String nome){
        for(int i = 0; i<3; i++){
            if(agenda[i].nome.equals(nome)){
                System.out.println("Indice de "+nome+" no banco: "+(i+1));
            }
        }
    }

    //A logica aqui eh simples, apenas exibimos as informações contidas no numero passado pelo usuario, o -1 serviu
    //para que eu não precisasse colocar -1 em cada index do vetor, isto pq num vetor de 3 posições, a posição 1 
    //eh a 0. Ou seja, se ele digitasse 2, se trata da posição 1 do vetor.
    static void exibirPessoa(Agenda[] agenda, int index){
        System.out.println("----------Informações da "+(index+1)+"° Pessoa-------------");
                System.out.println("Nome: "+agenda[index].nome);
                System.out.println("idade: "+agenda[index].idade);
                System.out.println("altura: "+agenda[index].altura);
    }

    /*
     * A logica para 'remover' uma pessoa eh simples, basta zerarmos as informações contidas naquela posição,
     * para isso, pesquisamos em qual posição o nome informado pelo usuario esta contido, ao encontrarmos-na, 
     * zeramos as informações
     * 
     * Perceba que Esta função possui um retorno de um Objeto, e mais fundo ainda, RETORNO DE UM VETOR DE OBJETO.
     * Isso vai servir para que as modificações realizadas nessa função, sejam mandadas para o main, e atualizemos
     * nosso vetor de objetos
     * 
     * Note tambem que temos um outro for, este serve para que joguemos as posições vazias do nosso vetor para o final.
     * Pois, numa situação onde o usuario apague um usuario do meio, ficariamos com um espaço vazio, e com um indice
     * desatualizado, então vemos se a posição atual esta vazia, se a mesma estiver, pegamos as informações da proxima casa
     * e jogamos nela, e logo depois, zeramos a proxima casa. Confuso? basta imaginar 3 copos em sequencia, se retirarmos o 
     * do meio, um espaço ficara entre os copos, então 'arrastamos' o copo da frente para perto do copo anterior
     * O mesmo ocorre com o nosso vetor de objeto
     */
    static Agenda[] removerPessoa(Agenda[] agenda, String nome){
        for (int i = 0; i<3; i++){
            if(agenda[i].nome.equals(nome)){
                agenda[i].nome = "";
                agenda[i].idade = 0;
                agenda[i].altura = 0.0;
            }
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<2; j++){
                if(agenda[j].nome.equals("")){
                    agenda[j].nome = agenda[j+1].nome;
                    agenda[j].idade = agenda[j+1].idade;
                    agenda[j].altura = agenda[j+1].altura;
                    agenda[j+1].nome = "";
                    agenda[j+1].idade = 0;
                    agenda[j+1].altura = 0.0;
                }
            }
        }
        return agenda;
    }

}
