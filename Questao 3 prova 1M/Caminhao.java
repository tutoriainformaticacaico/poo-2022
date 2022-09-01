public class Caminhao {//(0)Criando a classe Caminhao
    /* (1)Atributos
     * A questão já nos informa quais devemos inserir, e apesar de não informar, os mesmos deverão estar com visibilidade
     * privada e com seus metodos gets e sets. Talvez nunca mais utilizemos de atributos privados novamente (pelo menos em java)
     */
    private double toneladas;
    private int alturaMax;
    private int comprimento;

    //(2)Preencher
    /* A questão nos informa que devemos criar um metodo para preencher as informações, então basta que criemos
     * um metodo com parametros suficientes para referir a todos os nossos atributos
     * 
     * Perceba que temos a utilização do this. caso não lembre sua funcionalidade, ele serve para se referir a 
     * variaveis globais, isto eh, os atributos. Usamos o this geralmente quando temos alguma outra variavel sendo
     * utilizada como parametro de mesmo nome dos atributos. Para assim, o java ter uma forma de diferenciar a qual
     * estamos nos referindo.
     */
    public void preencher(double toneladas, int alturaMax, int comprimento){
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    //(3)Exibir
    /* Não tenho muito o que falar, eh um metodo que exibe todos os atributos na tela após ser chamado. */
    public void exibir(){
        System.out.println("Toneladas: " + toneladas);
        System.out.println("AlturaMax: " + alturaMax);
        System.out.println("Comprimento: " + comprimento);
    }

    public double getToneladas() {
        return toneladas;
    }
    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMax() {
        return alturaMax;
    }
    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

}
