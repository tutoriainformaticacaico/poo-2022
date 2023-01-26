public abstract class Quadrilateros implements FormaGeometrica{
    //como a questão informa a presença de 4 lados, transformei os 4 em variaveis 
    protected int lado1, lado2, lado3, lado4;

    public Quadrilateros(int lado1, int lado2, int lado3, int lado4){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    // implementando o perimetro
    public String calculaPerimetro() {
        //formula tirada da internet
        return "Perimetro: "+(lado1+lado2+lado3+lado4);
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado4() {
        return lado4;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }

    
    
}
