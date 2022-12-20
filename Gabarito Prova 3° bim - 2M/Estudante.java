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

    public void maiorNota(){
        NotaDisciplina nota = notas.get(0);
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) != null) {//verificar se nao está nulo
                if (notas.get(i).getNota()>nota.getNota()) {//verificar a maior nota
                    nota = notas.get(i);
                }
            }
        }
        if (nota == null) {
            System.out.println("Estudante ainda nao possui notas");
        }else{
            System.out.println("Sua maior nota foi: "+nota.getNota()+"\nMateria: "+nota.getDisciplina());
        }
    }
    
}
