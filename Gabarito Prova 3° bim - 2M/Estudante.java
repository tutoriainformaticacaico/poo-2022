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

    /* 
     * A logica desse metodo eh simples, comparamos se uma nota eh igual a alguma nota do outro estudante.
     * (por isso do for aninhado[dois for]), ou seja, comparamos uma posicao do atual estudante, com todas do 
     * outro estudante, fazemos isso já que não temos como saber qual será a nota igual, ela pode estar
     * tanto no começo, quanto no fim.
     */
    public boolean igualNota (Estudante outroEstudante) {
        for (int i = 0; i < notas.size(); i++) {
            for (int j = 0; j < outroEstudante.notas.size(); j++) {//pegando as notas do outro aluno
                if (outroEstudante.getNotas().get(j).getNota() == notas.get(i).getNota()) {//verificando se existe uma nota igual
                    if (outroEstudante.getNotas().get(j).getDisciplina().equals(notas.get(i).getDisciplina())) {//verificando se trata-se da mesma disciplina
                        return true;//retorna true, oq indica que teve uma nota igual numa mesma materia
                    }
                }
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
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumEstudante() {
        return numEstudante;
    }
    public void setNumEstudante(int numEstudante) {
        this.numEstudante = numEstudante;
    }

    public ArrayList<NotaDisciplina> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<NotaDisciplina> notas) {
        this.notas = notas;
    }

}
