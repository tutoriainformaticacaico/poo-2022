import java.util.*;

public class Sistema {
    private Produto[] comidas = new Produto[100];
    private Vendas[] vendas = new Vendas[100];
    private int limiteComidas;//Auxiliar de posicionamento do vetor comidas
    private int limiteVendas;//Auxiliar de posicionament do vetor de vendas
    private int senhaGerente;

    public Sistema(){
        limiteComidas = 0;
        limiteVendas = 0;
        senhaGerente = 1234;
    }

    //cadastra um produto no sistema
    public void cadastrarProduto(String nome, double preco, int quantidade){
        if(limiteComidas <= comidas.length-1){
            comidas[limiteComidas] = new Produto(nome, preco, quantidade, limiteComidas);
            limiteComidas++;//Atualizando o index do vetor de comidas
            System.out.println("!!!Cadastro realizado com sucesso!!!");
        }else{
            System.out.println("O banco ja esta cheio");
        }
    }

    //Realiza uma venda
    public void realizarVenda(int codigo, int quantidade){
        for (int i = 0; i < comidas.length; i++) {
            if (codigo == comidas[i].getCodigo()) {
                comidas[i].setQuantidade(comidas[i].getQuantidade()-quantidade);//Dando baixa no sistema
                vendas[limiteVendas] = new Vendas(codigo, quantidade, limiteVendas);//criando uma nova venda

                limiteVendas++;//Atualizando o index do vetor de vendas
                System.out.println("Venda efetuada com sucesso!!!!");
                break;//encerrando o laço for
            }
        }
    }

    //Verifica a senha digitada pelo usuario
    public boolean credencial(int senha){
        if (senha == senhaGerente) {
            return true;
        }else{
            return false;
        }
    }

    //exibe todos os produtos cadastrados
    public void exibir(){
        for (int i = 0; i < comidas.length; i++) {
            if (comidas[i] != null) {//verificando se a posicao não esta nula
                System.out.println(i+"- Nome: "+comidas[i].getNome()+"\tPreco: "+comidas[i].getPreco());
            }
            
        }
    }

    public void exibirVendas(){
        String nome = "";
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i]!=null) {
                for (int j = 0; j < comidas.length; j++) {
                    if (comidas[j] != null) {//verificando se a posicao não esta nula
                        if (comidas[j].getCodigo() == vendas[i].getCodigoProduto()) {//verificando se o codigo codigo do produto eh igual ao codigo do produto na venda
                            nome = comidas[j].getNome();
                            break;
                        }
                    }
                }
                System.out.println(i+"- Nome: "+nome+"\tQuantidade: "+vendas[i].getQuantidade()+"\tsemestre: "+vendas[i].getSemestre());
            }
        }
    }

    public Produto getComidas(int i) {
        return comidas[i];
    }
    public void setComidas(Produto[] comidas) {
        this.comidas = comidas;
    }

}
