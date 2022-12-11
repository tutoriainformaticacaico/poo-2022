public class Conhecido extends Pessoa{
    private String email;

    public Conhecido(){
        super();
        email = "indefinido";
    }

    public Conhecido(String nome, int idade, String email){
        super(nome, idade);
        this.email = email;
    }

    public String toString(){
        return "Nome: "+getNome()+
               "\nIdade: "+getIdade()+
               "\nEmail: "+email;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
