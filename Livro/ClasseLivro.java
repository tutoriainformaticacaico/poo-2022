/* 
*****Notas iniciais*******
 * Vale lembrar que essa eh apenas uma logica de fazer a questão, existem 1002 formas de faze-la
 * Recomendo que tente faze-la antes de olhar este conteudo
 *
 * Explicando o codigo---------
 *      Para instanciarmos uma classe, temos 2 etapas:
 * 1 - criar uma variavel do tipo da classe. Para isto, basta fazermos como Fariamos com um tipo de variavel normal
 * ex:
 * String nome //Inicializando uma variavel de tipo normal
 * ClasseLivro livro //Inicializando uma variavel do tipo da classe
 * 
 * Uma variavel de tipo da classe, pode receber o conteudo daquela classe, por exemplo:
 * 
 * Aluno a = new Aluno() //a receberá o conteudo da classe Aluno (seus atributos, metodos...)
 * Casa casa = new Casa() //a receberá o conteudo da classe Casa (seus atributos, metodos...)
 * 
 * E assim como uma variavel de tipo normal, podemos inicializa-la, e apenas depois inserirmos algo nela
 * 
 * Aluno a;
 * a = new Aluno();
 * 
 * Isso eh o que acontece nessa classe, apenas inicializamos as variaveis, para que depois o usuario insira
 * algum objeto contendo informações nela, como ocorre nas linhas 36 e 37 do arquivo Criando.java
 * 
 * lá, dizemos que nossa variavel receberá o conteudo da classe anterior da qual foi utilizada para passar informações
 * Isso eh identico ao que acontece quando coletamos algo no main, e enviamos para algum objeto
 * ex:
 * 
 * main{
 * Aluno a = new ALuno();
 * String letra = "hello";
 * a.nome = letra;
 * 
 * }
 * Aluno{
 * String nome;
 * }
 * Neste exemplo, pegamos a variavel nome da classe Aluno, e recebemos nela as informações guardadas na variavel letra,
 * portanto, a.nome agora retorna hello.
 * 
 * O mesmo acontece com nossas variaveis de classe, com os objetos já criados no main, a diferença eh apenas a quantidade
 * de informação que eh passada. enquanto no nosso exemplo passamos apenas letras, com nossas variaveis de classes, passamos 
 * TUDO nela contido, metodos, atributos, valores...
 * 
 *  
 * 
 * 
 */

public class ClasseLivro {
    private String ISBN;
    private String nome;
    private int ano;
    ClasseAutor autor;
    ClasseEditora editora;

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public ClasseAutor getAutor() {
        return autor;
    }
    public void setAutor(ClasseAutor autor) {
        this.autor = autor;
    }

    public ClasseEditora getEditora() {
        return editora;
    }
    public void setEditora(ClasseEditora editora) {
        this.editora = editora;
    }


    public void Validacao() {
        if (ano <= 2015 && ISBN.length() == 13) {
            System.out.println("O livro esta nas normas para ser publicado =)");
        }
        else{
            System.out.println("O livro nao obedece as normas para ser publicado");
        } 
    }
    
    
}