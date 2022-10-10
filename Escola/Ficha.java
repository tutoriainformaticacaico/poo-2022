public class Ficha {
    private String nomeAluno;
    private int id;
    private double notaAtvd;
    private double notaProva;
    private int idMateria;

    public Ficha(Ficha a){
        this.nomeAluno = a.getNomeAluno();
        this.id = a.getId();
        this.notaAtvd = a.getNotaAtvd();
        this.notaProva = a.getNotaProva();
        this.idMateria = a.getIdMateria();
    }

    public Ficha(){

    }

    public String toString(){
        return "Nome: " + nomeAluno + ", id: " + id+", notaAtvd: " + notaAtvd + ", notaProva: "+notaProva+", idMateria: " + idMateria;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
