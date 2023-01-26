public class CD  extends Produtos{
    private int numeroFaixas;

    //Perceba que aqui aproveitamos o contrutor da clase mãe, dessa forma, 
    //toda a lógica do contrutor da classe mãe será repetida aqui apenas 
    //utilizando de um comando "super".
    public CD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);//executando o contrutor da mãe
        this.numeroFaixas = numeroFaixas;
    }

    //O toString servirá para exibir todas as informações sem que seja necessario criar
    //um metodo só pra isso.
    public String toString(){
        return "CD: \n"+
               "Nome: " + nome+"\n"+
               "Preco: " + preco+"\n"+
               "Faixas: " + numeroFaixas;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }
    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

}
