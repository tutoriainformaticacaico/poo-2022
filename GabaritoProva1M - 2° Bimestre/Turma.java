import java.util.*;

public class Turma {
    private Professor professor;
    private ArrayList<Aluno> alunoList;
    private int quantAulas;

    public String verificaFaltas(Aluno a){
        if (a.getFaltas()>quantAulas*0.25) {
            return "RpF";
        }else{
            return "";
        }
    }

    public String verificaMedia(Aluno a){
        double notas[] = a.getNotas();
        double media = (notas[0]*2+notas[1]*2+notas[2]*3+notas[3]*3)/10;
        if (media>=6.0) {
            return "Apv";
        }else if(media >=2.0 ){
            return "Fn";
        }else{
            return "Rp";
        }
        
    }

    public Turma() {
        alunoList = new ArrayList<Aluno>();
        professor = new Professor();
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunoList() {
        return alunoList;
    }
    public void setAlunoList(ArrayList<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public int getQuantAulas() {
        return quantAulas;
    }
    public void setQuantAulas(int quantAulas) {
        this.quantAulas = quantAulas;
    }

}
