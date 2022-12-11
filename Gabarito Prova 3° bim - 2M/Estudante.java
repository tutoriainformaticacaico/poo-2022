import java.util.ArrayList;

public class Estudante {
    private static final int NUM_ANOS = 5;
    private String nome;
    private int numEstudante;
    private ArrayList<NotaDisciplina> notas = new ArrayList<NotaDisciplina>();

    public Estudante(String nome, int numEstudante) {
        this.nome = nome;
        this.numEstudante = numEstudante;
    }

    public void adicionaNota (int nota, String disciplina, int ano) { 
        notas.add(new NotaDisciplina (nota, disciplina, ano));
    }

    public boolean igualNota (Estudante outroEstudante, String disciplina) {
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).getDisciplina().equals(disciplina)) {
                return true;
            }
        }
        return false;
    }
    
}
