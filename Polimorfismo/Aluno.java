public class Aluno extends Pessoa{
    
    @Override
    public void exibir(){
        System.out.println(getIdade());
        super.setIdade(12);
        System.out.println(this.getIdade());
    }
}
