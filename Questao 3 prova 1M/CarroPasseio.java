public class CarroPasseio {
    private String cor;
    private String modelo;

    public void preencher(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public void exibir(){
        System.out.println("cor: " + cor);
        System.out.println("modelo: " + modelo);
    }
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
