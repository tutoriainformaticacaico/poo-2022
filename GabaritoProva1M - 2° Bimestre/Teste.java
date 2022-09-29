/* 
 * 1- Considerando os diversos exemplos em Sala de aula, as diversas atividades práticas, 
 * veja o seguinte cenário:
"A Professora Huliane está precisando de ajuda para decidir quem deverá passar na disciplina, 
ela precisa de um pequeno sistema para isso, ela já identificou algumas entidades entre elas uma 
classe Aluno com os seguintes atributos: nome(String), matricula(String), cpf(String); 
Uma classe disciplina: nome(String); Uma classe professor:nome(String), matricula(String), cpf(String);
Uma classe Turma: professor(Professor), alunos(Lista de alunos);”

Problemática: Contudo ele não consegue pensar em uma classe que permita lançar as notas dos 
alunos e suas faltas, veja que nessa classe precisamos saber quem são os alunos, quem é o professor, 
seja possível dizer os dias que o aluno faltou, as notas de suas atividades (duas atividades) 
e provas (duas provas) com seus respectivos pesos (peso 2 cada atividade e 3 para cada prova) 
e calcular se ele foi reprovado.

Desta forma você deverá implementar a solução para ajudar a professora, da seguinte forma:
Implementar as classes Aluno, Disciplina e Professor com seus get/set. (20 pontos)
Implemente a classe ou classes que resolva a problemática. (40 pontos)
Baseado na sua classe faça o método verificar falta de aluno, para dizer se o aluno foi reprovado por falta, 
isso ocorre se o aluno tiver mais de 25% de faltas. (20 pontos)
Baseado na sua classe faça o método para verificar se o aluno pode ir para final. 
O estudante que não for reprovado por falta e obtiver média igual ou superior a 20 (vinte) e 
inferior a 60 (sessenta) terá direito a  uma avaliação final em cada disciplina. (20 pontos)
 */

import java.util.*;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor p = new Professor();
        Aluno a[] = new Aluno[3];
        Turma t = new Turma();

        //definindo algumas notas padrões para indicar aos aluno
        double notas1[] = {10.0, 8.0, 7.5, 7,9};
        double notas2[] = {5.0, 5.0, 5.0, 5,0};
        double notas3[] = {2.0, 2.0, 2.0, 2,9};

        for (int i = 0; i < a.length; i++) {
            a[i] = new Aluno();
        }

        //dando um nome pro(a) professor(a)
        p.setNome("Hulianne");
        //definindo o professor para a turma t
        t.setProfessor(p);
        //definindo quantas aulas houveram
        t.setQuantAulas(10);

        //definindo os nomes dos alunos da turma //Dando uma matricula bacana pros mano Alunos
        a[0].setNome("Carlos");             a[0].setMatricula("345");
        a[1].setNome("Mario");              a[1].setMatricula("346");
        a[2].setNome("Kayo");               a[2].setMatricula("347");

        //definindo quantas aulas cada aluno assistiu
        a[0].setFaltas(3);                a[0].setNotas(notas2);
        a[1].setFaltas(0);                a[1].setNotas(notas1);
        a[2].setFaltas(1);                a[2].setNotas(notas3);

        //adicionando a nossa turma os alunos
        t.getAlunoList().add(a[0]);
        t.getAlunoList().add(a[1]);
        t.getAlunoList().add(a[2]);

        //Imprimindo todas as informações da turma
        System.out.println("-------Informações da Turma-------");
        System.out.println("\nProfessor(a): "+t.getProfessor().getNome()+"\n");
        
        for (int i = 0; i < t.getAlunoList().size(); i++) {
            Aluno auxi = t.getAlunoList().get(i); 
            System.out.println(t.getAlunoList().get(i).toString()+t.verificaFaltas(auxi)+t.verificaMedia(auxi)+"\n");
        }
        
        

    }
}
