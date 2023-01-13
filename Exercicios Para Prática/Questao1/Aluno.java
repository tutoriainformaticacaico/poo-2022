public class Aluno {
    private String nome;
    private long matricula;
    private double nota1, nota2, nota3;

    public double media(){
        double media = ((nota1*2.5)+(nota2*2.5)+(nota3*2.0))/7;
        return media;
    }

    public void mediaFinal(){
        double media = media();
        if (media >= 6.0) {
            System.out.println("Voce passou!!!");
        }else{
            System.out.println("Xiiiiii, vai de comes e bebes");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    
}
