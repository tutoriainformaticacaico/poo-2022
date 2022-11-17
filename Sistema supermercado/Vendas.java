public class Vendas {
    private int codigo;
    private int codigoProduto;
    private int quantidade;
    private int semestre;

    public Vendas(int codigo, int codigoProduto, int quantidade){
        this.codigo = codigo;
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.semestre = 1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}
