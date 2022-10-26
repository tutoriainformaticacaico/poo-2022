public class Livro extends Produto{
    private String autor;

    public Livro(){
        autor = "";
    }

    public Livro(String desc){
        setDescricao(desc);
    }

    public Livro(Livro l){
        this.autor = l.getAutor();
        this.setDescricao(l.descricao);
    }


    public String toString(){
        return "\n----Livro----\n"+getDescricao();
    }

    @Override
    public String getDescricao(){
        return descricao + ", "+autor;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

}
