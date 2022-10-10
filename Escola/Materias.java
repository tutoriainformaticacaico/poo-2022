public class Materias{
	private String nome;
	private String professor;
    private int idMateria;
    private double notaAtvd;
    private double notaProva;

    public Materias(){
        
    }

    public Materias(Materias a){
       this.nome = a.getNome();
       this.professor = a.getProfessor();
       this.idMateria = a.getIdMateria();
    }

    //serve para exibir as informações dessa classe, incluindo a media das notas
    public void exibir(){
        System.out.println("Materia: "+nome);
        System.out.println("Professor(a): "+professor);
        System.out.println("Nota atvd: "+notaAtvd);
        System.out.println("Nota prova: "+notaProva);
        System.out.println("Media: "+mediaMateria());
    }

    //serve para retornar apenas a media das notas
    public double mediaMateria(){
        return (notaAtvd+notaProva)/2;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public double getNotaAtvd() {
        return notaAtvd;
    }
    public void setNotaAtvd(double notaAtvd) {
        this.notaAtvd = notaAtvd;
    }

    public double getNotaProva() {
        return notaProva;
    }
    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }

    public int getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

}