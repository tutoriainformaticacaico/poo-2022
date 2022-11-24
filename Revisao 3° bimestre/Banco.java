public class Banco {
    private Produto[] produtos = new Produto[10];
    private Vendas[] vendas = new Vendas[10];
    private int count;
    private int countVendas;
    private Funcionario f;

    public Banco(){
        count = 0;
        countVendas = 0;
    }

    public void cadastrarProduto(String nome, double preco, int quantidade, int codigo){
        produtos[count] = new Produto(nome, preco, quantidade, codigo);
        count++;
    }

    public void exibirProdutos(){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println(produtos[i].getCodigo()+"- Nome: "+produtos[i].getNome()+"\tPreco: "+produtos[i].getPreco()+"\tQ: "+produtos[i].getQuantidade());
            }
            
        }
    }

    public void realizarVenda(int codigo, int quantidade){
        for (int i = 0; i < produtos.length; i++) {
            if (codigo == produtos[i].getCodigo()) {
                produtos[i].setQuantidade(produtos[i].getQuantidade()-quantidade);
                vendas[countVendas] = new Vendas(codigo, quantidade);
                countVendas++;
                break;
            }
        }
    }

    public void exibirVendas(){
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] != null) {
                System.out.println(vendas[i].getCodigoProduto()+"-\tQuantidade: "+vendas[i].getQuantidade()+"\tPeriodo: "+vendas[i].getPeriodo());
            }
        }
    }

    public Produto[] getProdutos() {
        return produtos;
    }
    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Vendas[] getVendas() {
        return vendas;
    }
    public void setVendas(Vendas[] vendas) {
        this.vendas = vendas;
    }

}
