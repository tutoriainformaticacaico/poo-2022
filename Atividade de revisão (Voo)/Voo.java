public class Voo {//(1)Classe voo
    private String data;
    private String horario;
    private int[] passageiros = new int[10];//(2)criando um vetor de 100 posições

    //(3)metodo proximoLivre
    /* A logica desse metodo eh bem simples até, utilizamos de um for para percorrer as posições do nosso 
     * vetor de passageiros, e utilizamos de um if para verificar se a posição i está livre, se o mesmo ocorrer
     * retornamos uma mensagem e utilizamos de um break para encerrar o for.
     */
    public void proximoLivre(){
        for (int i = 0; i < passageiros.length; i++) {
            if (passageiros[i] == 0) {//se tiver 0, significa que tá livre
                System.out.println("A cadeira "+(i+1)+" Esta livre");
                break;//finalizando o laço for, isso eh feito para retornar apenas a 1° cadeira vazia
            }
        }
    }

    //(4)Metodo verifica
    /* A logica eh simples, pegamos o valor digitado e verificamos se a posição informada está livre ou nãos*/
    public void verifica(int a){
        if (passageiros[a] == 0) {//se tiver 0 na posição informada, significa que a cadeira está livre
            System.out.println("A cadeira "+(a+1)+" esta livre");//o +1 serve para adaptar a posição do vetor para uma posicao usuario
        }else{
            //caso contrario, será informado que a cadeira já esta ocupada
            System.out.println("A cadeira "+(a+1)+" nao esta livre");//o +1 serve para adaptar a posição do vetor para uma posicao usuario
        }
    }

    //Metodo retornaVagas
    /* perceba que a logica utilizada eh a mesma que utilizamos no metodo que retorna a proxima cadeira livre
     * a unica diferença, eh que não encerramos o for logo apos encontrar uma cadeira livre
     */
    public void retornaVagas(){
        for (int i = 0; i < passageiros.length; i++) {
            if (passageiros[i] == 0) {//se tiver 0 na posição informada, significa que a cadeira está livre
                System.out.println("Posicao "+(i+1)+" esta livre:");
            }
        }
    }
    
    //(5)Metodo ocupa
    /* A logica eh IDENTICA ao do metodo verifica, onde mudamos apenas a mensagem de exibição */
    public void ocupa(int a){
        if (passageiros[a] == 0) {//se o valor for 0 na posição digitada, significa que a cadeira está livre, logo, eh possivel ser ocupada
            System.out.println("A cadeira "+(a+1)+" foi ocupada com sucesso!!");
        }else{
            //senao, significa que a mesma está ocupada
            System.out.println("Nao eh posivel ocupar a posicao "+(a+1)+", pois a mesma já esta ocupada");
        }
    }

    //(7)Metodo clone
    /* A logica eh simples, para clonarmos um objeto, basta igualarmos um objeto vazio a um objeto já criado
     * e como já vimos em outras questões, como a da agenda, eh possivel a passagem de Objetos como parametro.
     * Bastou apenas que retornemos ent o propio objeto informado. Assim, será igualado ao vetor c
     */
    public Voo clone(Voo b){
        return b;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int[] getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int[] passageiros) {//(0)Parametro com vetor completo sendo passado
        this.passageiros = passageiros;
    }

}
