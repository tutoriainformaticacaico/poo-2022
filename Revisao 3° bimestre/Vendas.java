public class Vendas {
    private int codigoProduto;
    private int quantidade;
    private String data;
    private int periodo;

    public Vendas(int codigo, int quantidade){
        this.codigoProduto = codigo;
        this.quantidade = quantidade;
        this.periodo = 1;
    }

    
    public int getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    

}
