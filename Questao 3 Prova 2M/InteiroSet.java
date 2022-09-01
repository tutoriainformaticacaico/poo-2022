/* 
 * 
 * 
 */
public class InteiroSet {
    private boolean[] a = new boolean[5];//(1)Array de inteiros do tipo boolean pedido

    //(7)Metodo toSetString
    /* Não tem nada de muito especial, apenas imprimir as informações do vetor */
    public void toSetString(){
        for (int i = 0; i < a.length; i++) {
            System.out.println((i+1)+": "+a[i]);
        }
    }

    //(2) metodo union
    /* Para gerarmos um terceiro vetor com base em dois informados, primeiro precisamos informa-los como parametro
     * (Já utilizamos de vetor como parametro em questões anteriores, portanto n explicarei muito a fundo)
     * Após isso, basta aplicarmos a lógica do OU num if, onde o resultado será guardado num vetor d (auxiliar)
     * 
     */
    public boolean[] union(boolean[] b, boolean [] c){
        boolean [] d = new boolean[5];
        for (int i = 0; i < 5; i++) {
            //traduzindo
            //se b[i] for igual a true OU c[i] for igual a true. 
            if(b[i] == true || c[i] == true){
                d[i] = true;//d[i] será true. Ou seja, se um dos dois tiver true na posição i, a posição i de d
                // será dada como true
            }else{
                d[i] = false;//Caso não aconteça (false com false), será atribuido false
            }
        }
        //Aqui retornamos o nosso vetor, para assim guardamos as informações coletadas num vetor auxiliar do main
        return d;
    }
    //(3)Metodo intercecao
    /* Para fazermos a intercecao, a lógica eh a mesma utilizada no OU
     * Mudamos apenas o nosso IF, para invez de utilizar OU, utilizar o E (&&)
     */
    public boolean[] intercecao(boolean[] b, boolean [] c){
        boolean [] d = new boolean[5];
        for (int i = 0; i < 5; i++) {
            //traduzindo
            //se b[i] for igual a true E c[i] for igual a true. 
            if(b[i] == true && c[i] == true){
                //d[i] será true. Ou seja, os dois tiver true na posição i, a posição i de d
                d[i] = true;//será dada como true
            }else{
                //caso contrario, será retornado false
                d[i] = false;
            }
        }
        //Aqui retornamos o nosso vetor, para assim guardamos as informações coletadas num vetor auxiliar do main
        return d;
    }

    //(8)Metodo intercecao
    /* A lógica eh bem simples até, comparamos se posição i de a eh igual a i de b, se o mesmo ocorrer, será adicionado
     * 1 a um contador. Ou seja, se isso acontecer a quantidade de vezes que corresponda ao tamanho do vetor, ambos serão 
     * iguais
    */
    public void ehIgualTo(boolean[]a, boolean[]b){
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if(a[i] == b[i] ){
                contador++;//adicionando 1 caso seja igual
            }
        }

        if (contador == 5) {//como o vetor tem 5 posições, se o contador chegar em 5, significa que ambos são iguais
            System.out.println("Vetores informados sao iguais");
        }else{
            //caso não ocorra, então não são iguais
            System.out.println("Vetores informados nao sao iguais");
        }

    }

    //(4) Metodo de inserir elemento
    /* A lógica eh simples, pegamos o valor informado pelo usuario e mudamos essa posição para true */
    public void insereElemento(int a){
        this.a[a] = true;//(6)
        System.out.println("Valor true foi inserido na posicao "+(a+1)+" do Vetor");
    }
    //(5) Metodo de inserir elemento
    /* A lógica eh simples, pegamos o valor informado pelo usuario e mudamos essa posição para false */
    public void removeElemento(int a){
        this.a[a] = false;//(6)
        System.out.println("Valor false foi inserido na posicao "+(a+1)+" do Vetor");
    }

    public boolean[] getA() {
        return a;
    }
    public void setA(boolean[] a) {
        this.a = a;//(6)
    }

}
