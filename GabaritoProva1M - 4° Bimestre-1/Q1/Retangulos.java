public class Retangulos extends Quadrilateros{
    private int tamBase, altura;

    //O toString vai nos permitir exibir todas as informações 
    //sem que seja necessario criar um metodo pra isso.
    public String toString(){
        return "Retangulo: \n"+
               "Lados: "+lado1+", "+lado2+", "+lado3+", "+lado4+"\n"+
               calculaArea()+"\n"+
               calculaPerimetro();
    }

    public Retangulos(int lado1, int lado2, int lado3, int lado4, int tamBase, int altura){
        super(lado1, lado2, lado3, lado4);
        this.tamBase = tamBase;
        this.altura = altura;
    }

    public String calculaArea() {
        //formula tirada da internet
        return "Area: "+(tamBase*altura);
    }

    public int getTamBase() {
        return tamBase;
    }

    public void setTamBase(int tamBase) {
        this.tamBase = tamBase;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


}
