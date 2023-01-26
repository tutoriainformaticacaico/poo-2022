public abstract class Produtos{
    //Os atributos foram colocados protegidos para que não fosse
    //necessária a utilização de gets e sets nas classes filhas
    protected String nome;
    protected double preco;
    
    //Esse construtor vai servir para que preenchamos algumas informações diretamente no main
    //já no momento da criação do produto
    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}