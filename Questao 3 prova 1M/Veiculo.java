public class Veiculo {
    private int peso;
    private int velocMax;
    private double preco;

    public void preencher(int peso, int velocMax, double preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public void exibir(){
        System.out.println("Peso: " + peso);
        System.out.println("Veloc: " + velocMax);
        System.out.println("Preco: " + preco);
    }
    
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocMax() {
        return velocMax;
    }
    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
