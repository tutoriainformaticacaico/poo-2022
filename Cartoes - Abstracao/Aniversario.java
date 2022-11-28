public class Aniversario extends CartaoWeb{
    
    public Aniversario(String destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversario "+destinatario);
        
    }

}
