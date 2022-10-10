// Faça um algoritmo que receba as notas das disciplinas cursadas pela turma Info 1M do IFRN, 
// no terceiro bimestre do ano letivo 2022. Mostre o nome dos alunos, matrícula de cada, 
// a média das disciplinas (aritmética). Considerando que para cada disciplina são realizadas 
// uma atividade avaliativa e uma prova, então você deve mostrar as notas que o aluno tirou 
// em cada disciplina, bem como a média por disciplina.

/* 
 *-----------Explicação do codigo---------------
    Este codigo foi realizado utilizando os conceitos até agora aprendidos (encapsulamento, construtor e objetos) 
    em um nivel mais alto. Com um adicional de ArrayList para melhor construção e uma organização aproximada da 
    forma que ocorreria num sistema real.

    1° considere todos os ArrayLists como se fossem um banco de dados para diferentes informações
    2° ArrayLists se resume a um Array(vetor) onde se eh possivel manipula-lo de uma forma mais livre
    pois o mesmo possui diversas funções uteis como: .size()[que retorna o tamanho de si] e .add()[que adiciona
    uma nova posição a si]. Ou seja, diferente de um array normal, o tamanho eh totalmente moldavel.
    3° O codigo no momento atual (10/10/2022) nao conterá uma explicação muito detalhada, para que 
    seja feita uma analise de como o mesmo funciona. Futuramente, se pedido, uma melhor explicação será feita.

    ps: apesar da semelhança com a estrutura de como seria um sistema real, muitas mudanças ainda podem ser
    feitas, fiquem avontade para mecherem no codigo.
 */

import java.util.Scanner;

public class TesteEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema sis = new Sistema();
        Aluno aluno[] = new Aluno[3];//nosso sistema possuirá 3 alunos
        Materias matematica = new Materias();//objeto referente a matematica
        Materias portugues = new Materias();//objeto referente a portugues

        //Cadastrando novas materias
        matematica.setNome("Matematica");//nome da materia
        matematica.setProfessor("Ronieri");//nome do professor
        matematica.setIdMateria(1);

        portugues.setNome("Portugues");
        portugues.setProfessor("Felipe");
        portugues.setIdMateria(2);

        sis.setMaterias(matematica);//adicionando a materia matematica ao sistema
        sis.setMaterias(portugues);//adicionando a materia portugues ao sistema

        for (int i = 0; i < aluno.length; i++) {
            aluno[i] = new Aluno();
        }

        //Dando um nome e ID para cada aluno
        aluno[0].setNome("Glau");//adicionando um nome ao aluno
        aluno[0].setId(1);//adicionando um id ao aluno (poderia ser a matricula tb)

        aluno[1].setNome("Fabio");
        aluno[1].setId(2);

        aluno[2].setNome("Kayo");
        aluno[2].setId(3);

        //atualizando os dados dos alunos na ficha interna
        aluno[0].atualizaNome();
        aluno[1].atualizaNome();
        aluno[2].atualizaNome();

        //atualizando os alunos no banco de alunos
        sis.setAlunos(aluno[0]);
        sis.setAlunos(aluno[1]);
        sis.setAlunos(aluno[2]);

        //Preenchimento de dados Aluno 0---------------------------------------
        //adicionando a nota do aluno 0(glauzao) na materia 0(matematica)
        aluno[0].getF().setIdMateria(1);
        aluno[0].getF().setNotaAtvd(8);
        aluno[0].getF().setNotaProva(8.5);        

        sis.setFicha(aluno[0].getF());//adicionando dados ao banco de notas

        //adicionando a nota do aluno 0(glauzao) na materia 1(portugues)
        aluno[0].getF().setIdMateria(2);
        aluno[0].getF().setNotaAtvd(7);
        aluno[0].getF().setNotaProva(5);

        sis.setFicha(aluno[0].getF());//adicionando dados ao banco de notas

        // Preenchimento de dados Aluno 1---------------------------------------
        // adicionando a nota do aluno 0(glauzao) na materia 0(matematica)
        aluno[1].getF().setIdMateria(1);
        aluno[1].getF().setNotaAtvd(10);
        aluno[1].getF().setNotaProva(8.5);        

        sis.setFicha(aluno[1].getF());//adicionando dados ao banco de notas

        //adicionando a nota do aluno 0(glauzao) na materia 1(portugues)
        aluno[1].getF().setIdMateria(2);
        aluno[1].getF().setNotaAtvd(5);
        aluno[1].getF().setNotaProva(5);

        sis.setFicha(aluno[1].getF());//adicionando dados ao banco de notas

        //Preenchimento de dados Aluno 2---------------------------------------
        //adicionando a nota do aluno 0(glauzao) na materia 0(matematica)
        aluno[2].getF().setIdMateria(1);
        aluno[2].getF().setNotaAtvd(4);
        aluno[2].getF().setNotaProva(8.5);        

        sis.setFicha(aluno[2].getF());//adicionando dados ao banco de notas

        //adicionando a nota do aluno 0(glauzao) na materia 1(portugues)
        aluno[2].getF().setIdMateria(2);
        aluno[2].getF().setNotaAtvd(7);
        aluno[2].getF().setNotaProva(10);

        sis.setFicha(aluno[2].getF());//adicionando dados ao banco de notas

        // ------------Testando os dados preenchidos---------------
        //Imprimindo as notas de um determinado aluno
        //sis.boletimAluno(1);

        //Imprimindo as notas dos alunos
        sis.boletimTurma();
        

        

    }
}
