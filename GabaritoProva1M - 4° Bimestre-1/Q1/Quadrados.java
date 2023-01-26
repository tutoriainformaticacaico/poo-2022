public class Quadrados extends Quadrilateros{
    private int tamLado;

    public Quadrados(int lado1, int lado2, int lado3, int lado4, int tamLado) {
        super(lado1, lado2, lado3, lado4);
        this. tamLado = tamLado;
    }

    //O toString vai nos permitir exibir todas as informações 
    //sem que seja necessario criar um metodo pra isso.
    public String toString(){
        return "Quadrado: \n"+
               "Lados: "+lado1+", "+lado2+", "+lado3+", "+lado4+"\n"+
               "Area: "+calculaArea()+"\n"+
               "Perimetro: "+calculaPerimetro();
    }

    public String calculaArea() {
        //formula tirada da internet
        return "Area: "+(tamLado*tamLado);
        
    }
}
