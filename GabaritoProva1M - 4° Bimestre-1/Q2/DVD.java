public class DVD  extends Produtos{
    private double duracao;

    //Perceba que aqui aproveitamos o contrutor da clase mãe, dessa forma, 
    //toda a lógica do contrutor da classe mãe será repetida aqui apenas 
    //utilizando de um comando "super".
    public DVD(String nome, double preco, double duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    //O toString servirá para exibir todas as informações sem que seja necessario criar
    //um metodo só pra isso.
    public String toString(){
        return "DVD: \n"+
               "Nome: " + nome+"\n"+
               "Preco: " + preco+"\n"+
               "Duracao: " + duracao;
    }

    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
