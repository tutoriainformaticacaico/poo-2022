/* 3- (40 pontos) Crie uma classe em Java chamada InteiroSet. Cada objeto InteiroSet pode 
armazenar inteiros no intervalo de 0 a 100. O conjunto é representado por um array de booleans. 
O elemento do array a[i] é true se o inteiro i estiver no conjunto. O elemento do array a[j] 
é false se o inteiro não estiver no conjunto. Lembrar de fazer uma classe teste, para testar 
as funcionalidades da classe

InteiroSet. Forneça os seguintes métodos:
Método union cria um terceiro conjunto que é a união teórica de dois conjuntos existentes (isto é, aplicação da função lógica OU sobre os conjuntos e retorna o valor lógico true ou false).
Método interseccao cria um terceiro conjunto que é a intersecção teórica de dois conjuntos existentes (isto é, aplicação da função lógica AND sobre os conjuntos e retorna o valor lógico true ou false).
Método insereElemento insere um novo elemento inteiro k em um conjunto (configurando a[k] como true).
Método deleteElemento exclui o inteiro m (configurando a[m] como false).
Método toSetString retorna uma string contendo um conjunto como uma lista de números separados por espaço. Inclua somente os elementos que estão presentes no conjunto. Utilize -"para representar um conjunto vazio.
Método ehIgualTo determina se dois conjuntos são iguais. 

***Notas iniciais***

    A começar, gostaria de freezar que aqueles que ainda não tentaram resolver calmamente está questão o 
    faça antes de consultar esse gabarito. Ademais, para aqueles que JA TENTARAM PRA KRLH, existem 1001 formas
    de resolver essa questão, após consultar essa forma, recomendo o retentar (essa palavra existe?? ksksk) da 
    mesma, agora que tudo ficará mais claro. Agora sem mais delongas, simbora pra explicação.

***Explicacao do codigo***

    (n) indice para encontrar no outro arquivo a explicação

    ps: Já aviso de antemão que essa questão me deixou confuso em algumas partes, mas creio estár 90%¨correta :)

    Primeiro, a questão nos pede para criarmos uma classe chamada "InteiroSet", então já o fizemos, 
    adiante, ela informa que ela pode armazenar inteiros no intervalo de 0 a 100, que será representado
    por um array de booleans. (1)Então colocamos na classe este array como atributo.

    Essa parte atual eh meio confusa, então vamos pular pors metodos que tudo ficará mais claro

    A começar pelo metodo union, que utiliza dois conjuntos criados e aplica no mesmo a regra do OU (FF da F)
    Como funciona então?? digamos que tenhamos dois vetores de 3 posições
    a[0] = true         b[0] = true                     
    a[1] = false        b[1] = false
    a[2] = false        b[2] = true

    Esse metodo gerára um terceiro vetor, sendo resultado da regra OU lógica, ou seja, se houver pelo
    menos um true, o resultado será true.
    a[0] = true         b[0] = true         c[0] = true                  
    a[1] = false        b[1] = false        c[1] = false
    a[2] = false        b[2] = true         c[2] = true

    Ou seja, para fazermos isso, primeiramente temos que criar dois vetores, como a classe já nos 
    traz um array, então criei dois objetos, para representar o vetor a e o outro b. 
    (os vetores auxia e auxib servem para preencher os objetos com valores aleatorios gerados pelo random) 

    Perceba que durante a utilização do metodo set de nosso vetor, passamos apenas o nome de nosso vetor auxiliar
    isso ocorre porque no geramento do set para modificarmos nosso objeto, o parametro se trata de um vetor por 
    completo, ou seja, passar informações 1 por 1, não funcionará

    (2)Partindo agora para nosso metodo Union 
    Após isso, atribuimos a um vetor auxiliar o resultado do metodo union.

    (3)Partindo para o metodo Intercecao
    Após isso, guardamos o resultado tambem num vetor auxiliar

    (4)Partindo para o metodo de inserir elemento, ele nós informa que o valor digitado, mudará a posição 
    de a[k] para true, ou seja, ao digitar 3 por exemplo, a posição 2 deverá ser mudada para true

    (5)Partindo para o metodo de remover um elemento, ele nos informa que o valor digitado, mudará a posição
    de a[m] para false.

    (6)lembrete: o this, serve para referenciarmos as variaveis globais (os atributos), isto serve para que 
    possamos ter o parametro com o mesmo nome do atributo, e informarmos a o JAVA uma forma de diferencia-los

    (7)Partindo para o toSetString

    (8)Partindo para o ehIgualTo
    Aqui tambem informamos dois vetores como parametro (pratica já utilizada na atvd da Agenda)

    Bem, eh isso, Mas como eu informei anteriormente, algumas coisas me deixam meio confuso, como pedir
    um vetor de 0 a 100 de inteiros, mas só usar true e false e depois querer numeros nele???
    Talvez se eu pensar em outra forma dps, eu mando tb pra voces, corrijindo esse "erro". 
    
    ***Notas finais***
    Se mesmo após esse gabarito e explicação restarem duvidas, recomendo o melhor estudo desses tópicos
        *metodos
        *vetores
        *metodos com parametros de vetores e/ou objetos
        *encapsulamento

*/

import java.util.*;

public class Teste{
    public static void main(String[] args) {
        InteiroSet a = new InteiroSet();
        InteiroSet b = new InteiroSet();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        boolean auxia[] = new boolean[5];//vetor auxiliar, terá gerará posições aleatorias para o nosso objeto A
        boolean auxib[] = new boolean[5];//vetor auxiliar, terá gerará posições aleatorias para o nosso objeto B

        boolean auxiOu[] = new boolean[5];//vetor auxiliar, guardará o resultado do Unio (aplicação da regra Ou)
        boolean auxiAnd[] = new boolean[5];//vetor auxiliar, guardará o resultado do Unio (aplicação da regra AND)

        //Preenchendo de forma aleatorias as posições dos vetores auxiliares
        for (int i = 0; i < 5; i++) {
            auxia[i] = rd.nextBoolean();
            auxib[i] = rd.nextBoolean();
            System.out.println("Valores de A " +auxia[i]);
            System.out.println("Valores de B " +auxib[i]);
        }
        //passando as posições geradas para os nossos objetos
        a.setA(auxia);
        b.setA(auxib);

        auxiOu = a.union(auxia, auxib);//Atribuindo o resultado de Union a um vetor auxliar

        System.out.println("-----Resultado da uniao de A e B com OU-----");
        for (int i = 0; i < auxiOu.length; i++) {
            System.out.println((i+1)+": "+auxiOu[i]);//Apenas imprimindo as informações do OU
        }
        System.out.println("-----Fim do resultado do OU-----\n");

        System.out.println("-----Resultado da uniao de A e B com AND-----");
        auxiAnd = a.intercecao(auxia, auxib);//Atribuindo o resultado de Intercecao a um vetor auxiliar
        for (int i = 0; i < auxiOu.length; i++) {
            System.out.println((i+1)+": "+auxiAnd[i]);//Apenas imprimindo as informações do AND
        }
        System.out.println("-----Fim do resultado do AND-----\n");

        System.out.println("-----Modulo de inserimento de valor-----");
        System.out.println("Digite a posicao a que deseja mudar para true");
        int posicao = sc.nextInt();//coletando um valor
        a.insereElemento(posicao-1);//o -1 serve para adaptar o numero do usuario para o vetor, já que começamos a contar do 0
        System.out.println("-----Fim do Modulo de inserimento de valor-----\n");

        System.out.println("-----Modulo de removimento de valor-----");
        System.out.println("Digite a posicao a que deseja mudar para false");
        posicao = sc.nextInt();//coletando um valor
        a.removeElemento(posicao-1);//o -1 serve para adaptar o numero do usuario para o vetor, já que começamos a contar do 0
        System.out.println("-----Fim do Modulo de removimento de valor-----\n");

        System.out.println("-----Modulo de exibir valores-----");
        System.out.println("Valores do vetor A:");
        a.toSetString();//chamando a exibição dos valores
        System.out.println("-----Fim do Modulo de exibir valores-----\n");

        System.out.println("-----Modulo de comparar vetores-----");
        a.ehIgualTo(a.getA(), b.getA());//comparando dois vetores informados, perceba que por nosso vetor ser privado, temos de utilizar o get para retornar ao parametro
        System.out.println("-----Fim do Modulo de comparar vetores-----");

    }
}