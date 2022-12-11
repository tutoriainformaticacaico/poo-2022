public class NotaDisciplina {
    private double nota;
    private String disciplina;
    private int ano;

    public NotaDisciplina(double nota, String disciplina, int ano) {
        this.nota = nota;
        this.disciplina = disciplina;
        this.ano = ano;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}
