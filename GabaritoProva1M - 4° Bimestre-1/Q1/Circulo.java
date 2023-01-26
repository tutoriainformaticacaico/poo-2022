public class Circulo implements FormaGeometrica{
    private double tamRaio;

    public Circulo(double tamRaio){
        this.tamRaio = tamRaio;
    }
    
    //O toString vai nos permitir exibir todas as informações 
    //sem que seja necessario criar um metodo pra isso.
    public String toString(){
        return "Circulo: \n"+
               "Raio: "+tamRaio+"\n"+
               calculaArea()+"\n"+
               calculaPerimetro();
    }

    public String calculaPerimetro() {
        //formula tirada da internet
        return "Perimetro: "+(2*3.14*tamRaio);
    }

    public String calculaArea() {
        //formula tirada da internet
        return "Area: "+(3.14*(tamRaio*tamRaio));
    }
    
    public double getTamRaio() {
        return tamRaio;
    }
    public void setTamRaio(double tamRaio) {
        this.tamRaio = tamRaio;
    }

}
