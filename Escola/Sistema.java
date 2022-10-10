import java.util.*;

public class Sistema {
    private ArrayList <Ficha> ficha;//funcionara como um banco dos alunos e suas respectivas notas
    private ArrayList <Materias> materias;//funcionara como um banco das materias disponiveis
    private ArrayList <Aluno> alunos;//funcionara como um banco dos alunos cadastrados

    //inicializando nossos arrayLists
    public Sistema(){
        ficha = new ArrayList<Ficha>();
        materias = new ArrayList<Materias>();
        alunos = new ArrayList<Aluno>();
    }

    //aqui informamos o id do aluno que desejamos ver as notas
    public void boletimAluno(int id){
        for (int i = 0; i < ficha.size(); i++) {
            if (ficha.get(i).getId() == id) {
                System.out.println("\nNotas do aluno *"+ficha.get(i).getNomeAluno()+"*\tId: "+ficha.get(i).getId());
                for (int j = 0; j < ficha.size(); j++) {
                    if(ficha.get(j).getId() == id){
                        System.out.println(materias.get(ficha.get(j).getIdMateria()-1).getNome()+":\t"+ficha.get(j).getNotaAtvd()+"\t"+ficha.get(j).getNotaProva()+"\t"+((ficha.get(j).getNotaProva()+ficha.get(j).getNotaAtvd())/2));
                    }
                }
                break;
            }
        }
    }

    public void boletimTurma(){
        System.out.println("--------Boletim geral da turma--------\n");
        for (int i = 0; i < alunos.size(); i++) {
            boletimAluno(i+1);
        }
    }

    public ArrayList <Ficha> getFicha() {
        return ficha;
    }
    public void setFicha(Ficha a) {
        this.ficha.add(new Ficha(a));
    }

    public ArrayList <Materias> getMaterias() {
        return materias;
    }
    public void setMaterias(Materias a) {
        this.materias.add(new Materias(a));
    }

    public ArrayList <Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno a) {
        this.alunos.add(new Aluno(a));
    }

}
