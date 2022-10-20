public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(){
        idade = 20;
    }

    public void exibir(){
        System.out.println("Ola, sou uma pessoa");
    }

    public Pessoa(int idade){
        this.idade = idade;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
    }
    public Pessoa(int idade, String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
