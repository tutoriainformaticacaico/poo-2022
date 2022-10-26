public class Mouse extends Produto{
    private int tipo;

    public Mouse(){
        tipo = 0;
    }

    public Mouse(Mouse m){
        this.tipo = m.getTipo();
        this.setDescricao(m.descricao);
    }

    public Mouse(String desc){
        setDescricao(desc);
    }

    public String toString(){
        return "\n----Mouse---\n"+this.getDescricao();
    }

    @Override
    public String getDescricao(){
        return descricao + ", "+tipo;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
