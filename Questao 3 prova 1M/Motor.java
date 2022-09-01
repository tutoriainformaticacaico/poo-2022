public class Motor {
    private int numCilindro;
    private int potencia;

    public void preencher(int numCilindro, int potencia) {
        this.numCilindro = numCilindro;
        this.potencia = potencia;
    }

    public void exibir(){
        System.out.println("Numero do cilindro: " + numCilindro);
        System.out.println("Potencia: " + potencia);
    }

    public int getNumCilindro() {
        return numCilindro;
    }
    public void setNumCilindro(int numCilindro) {
        this.numCilindro = numCilindro;
    }

    
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
