public class Aluno extends Pessoa{
    private int faltas;
    private double [] notas;

    public String media(){
        double media = (notas[0]*2+notas[1]*2+notas[2]*3+notas[3]*3)/10;
        return "Media: " + media;
    }

    public String toString(){
        return "Aluno: "+this.getNome()+
        "\nNotas:  "+notas[0]+"   "+notas[1]+"    "+notas[2]+"   "+notas[3]+"    " +media()+
        "\nMatricula: "+this.getMatricula()+
        "\nFaltas: "+faltas+
        "\nStatus: ";
    }

    public Aluno(){
        notas = new double[4];
    }
    
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double [] getNotas() {
        return notas;
    }
    public void setNotas(double [] notas) {
        this.notas = notas;
    }

}
