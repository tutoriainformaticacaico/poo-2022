import java.util.*;

/*
Questão 1- Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.

Explicando arrayList****
se trata de um array, onde não somos obrigados a informar posições, a vantagem disso, eh desde
quantidade de memoria gasta, a nivel de computador. A facilitação na realização de algumas tarefas.

Array list nos permite adicionar, remover, modificar, alternar... qualquer posição de si apenas
com funções internas.
*/

public class Questao1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Agenda> agendas = new ArrayList<Agenda>(); 
        Agenda[] agenda = new Agenda[3];

        for(int i = 0; i < agenda.length; i++){
            agenda[i] = new Agenda();
        }

        for(int i = 0; i < agenda.length; i++){
            System.out.println("Digite o nome da "+(i+1)+"° Pessoa");
            agenda[i].nome = sc.nextLine();
        }

        for(int i = 0; i < agenda.length; i++){
            agendas.add(agenda[i]);
        }

        exibir(agendas);

        System.out.println("Qual pessoa deseja remover??");
        String nome = sc.nextLine().toLowerCase();

        remover(agendas, nome);
        exibir(agendas);

        System.out.println("Qual indice deseja visualizar??");
        int auxi = sc.nextInt();

        exibirPessoa(agendas, (auxi-1));

        sc.nextLine();

        System.out.println("Deseja ver o indice de qual pessoa/?");
        nome = sc.nextLine().toLowerCase();

        retornaPessoa(agendas, nome);

    }

    static void exibir(ArrayList<Agenda> agendas){
        System.out.println("----------Pessoas armazenadas----------");
        for(int i = 0; i < agendas.size(); i++){
            System.out.println("Nome: "+agendas.get(i).nome);
        }
    }

    static void remover(ArrayList<Agenda> agendas, String nome){
        for(int i = 0; i < agendas.size(); i++){
            if(agendas.get(i).nome.equals(nome)){
                System.out.println("Pessoa: "+agendas.get(i).nome+", Removida com sucesso!!!");
                agendas.remove(i);
            }
        }
    }

    static void exibirPessoa(ArrayList<Agenda> agendas, int auxi){
        System.out.println("Pessoa na posicao "+auxi+"\nNome: "+agendas.get(auxi).nome);
    }

    static void retornaPessoa(ArrayList<Agenda> agendas, String nome){
        for(int i = 0; i < agendas.size(); i++){
            if(agendas.get(i).nome.equals(nome)){
                System.out.println("A pessoa no indice "+(i+1)+", eh "+ agendas.get(i).nome);
            }
        }
    }


}