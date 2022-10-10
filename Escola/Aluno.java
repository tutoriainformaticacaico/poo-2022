import java.util.*;

public class Aluno {
    private String nome;
    private int id;
    private Ficha f;

    public Aluno(Aluno a){
        this.nome = a.getNome();
        this.id = a.getId();
    }

    public Aluno(){
        f = new Ficha();
    }

    public void atualizaNome(){
        f.setNomeAluno(nome);
        f.setId(id);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Ficha getF() {
        return f;
    }
    public void setF(Ficha f) {
        this.f = f;
    }

}
