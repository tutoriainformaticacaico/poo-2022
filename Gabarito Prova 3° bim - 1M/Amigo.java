public class Amigo extends Pessoa{
    private String dataAniversario;

    public Amigo(){
        super();
        dataAniversario = "indefinido";
    }

    public Amigo(String nome, int idade, String dataAniversario){
        super(nome, idade);
        this.dataAniversario = dataAniversario;
    }
    
    public String toString(){
        return "Nome: "+getNome()+
               "\nIdade: "+getIdade()+
               "\nAniversario: "+dataAniversario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }
    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

}
