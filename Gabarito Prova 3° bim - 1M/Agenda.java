public class Agenda {
    private Pessoa pessoas[];
    private int quantAmigos;
    private int quantConhecidos;

    public Agenda(int quantidade){
        pessoas = new Pessoa[quantidade];
        quantAmigos = 0;
        quantConhecidos = 0;

        for (int i = 0; i < pessoas.length; i++) {
            int tipo = 1+(int)(Math.random()*2);

            if (tipo == 1) {
                pessoas[i] = new Amigo();
                quantAmigos++;
            }else{
                pessoas[i] = new Conhecido();
                quantConhecidos++;
            }
        }

    }
    //nao encontrei uma forma pratica de usar esse metodo da forma que a questao pede ;(
    //entao fiz da minha forma ^^
    public void addInformacoes(String nome, int idade, String adicional, int tipo, int posicao){
        if (tipo== 1) {
            pessoas[posicao] = new Amigo(nome, idade, adicional);
        }else{
            pessoas[posicao] = new Conhecido(nome, idade, adicional);
        }
        
    }

    public void imprimeAniversarios(){
        System.out.println("-----Lista de aniversarios dos Amigos-------");
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getClass().getName().equals("Amigo")) {
                System.out.println(pessoas[i].toString()+"\n");
            }
        }
    }

    public void imprimeEmails(){
        System.out.println("-----Lista de Emails dos Conhecidos-------");
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getClass().getName().equals("Conhecido")) {
                System.out.println(pessoas[i].toString()+"\n");
            }
        }
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public Pessoa getPessoa(int i){
        return pessoas[i];
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public int getQuantAmigos() {
        return quantAmigos;
    }

    public void setQuantAmigos(int quantAmigos) {
        this.quantAmigos = quantAmigos;
    }

    public int getQuantConhecidos() {
        return quantConhecidos;
    }

    public void setQuantConhecidos(int quantConhecidos) {
        this.quantConhecidos = quantConhecidos;
    }

    
}
