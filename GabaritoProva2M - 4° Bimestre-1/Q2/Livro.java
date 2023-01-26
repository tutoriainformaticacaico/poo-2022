public class Livro extends Produtos{
    private String nomeAutor;

    //Perceba que aqui aproveitamos o contrutor da clase mãe, dessa forma, 
    //toda a lógica do contrutor da classe mãe será repetida aqui apenas 
    //utilizando de um comando "super".
    public Livro(String nome, double preco, String nomeAutor) {
        super(nome, preco);
        this.nomeAutor = nomeAutor;
    }
    
    //O toString servirá para exibir todas as informações sem que seja necessario criar
    //um metodo só pra isso.
    public String toString(){
        return "Livro: \n"+
               "Nome: " + nome+"\n"+
               "Preco: " + preco+"\n"+
               "Autor: " + nomeAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

}
