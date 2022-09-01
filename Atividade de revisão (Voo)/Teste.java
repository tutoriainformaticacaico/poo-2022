/* Escreva uma classe em que cada objeto representa um voo que acontece em determinada 
data e em determinado horário. Cada voo possui no máximo 100 passageiros, e a classe permite 
controlar a ocupação das vagas. A classe deve ter os seguintes métodos:

proximoLivre - retorna o número da próxima cadeira livre;
verifica - verifica se o número da cadeira recebido como parâmetro está ocupada;
ocupa - ocupa determinada cadeira do voo, cujo número é recebido como parâmetro, e retorna verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso contrário;
vagas - retorna o número de cadeiras vagas disponíveis (não ocupadas) no voo e o número total de cadeiras do voo;
clone - o objeto clona a si próprio, para isto, ele cria um novo objeto da mesma classe e faz uma cópia dos valores de seus atributos.

***Notas iniciais***
    (n) indice para encontrar no outro arquivo a explicação

    A começar, gostaria de freezar que aqueles que ainda não tentaram resolver calmamente está questão o 
    faça antes de consultar esse gabarito. Ademais, para aqueles que JA TENTARAM PRA KRLH, existem 1001 formas
    de resolver essa questão, após consultar essa forma, recomendo o retentar (essa palavra existe?? ksksk) da 
    mesma, agora que tudo ficará mais claro. Agora sem mais delongas, simbora pra explicação.

***Explicacao do codigo***

    A principio, a questão nos pede que criemos uma classe para Voos, (1)o mesmo foi feito.
    Adiante, ele nos informa que a classe terá as informações de data e hora, então basta cria-los como atributos
    Seguindo afrente, ele nos informa que cada voo terá no maximo 100 passageiros, então basta que criemos um vetor
    de boolean ou int com essa quantidade de posições, (2)o mesmo foi feito.

    Utilizei no main um random para preencher aleatoriamente as cadeiras com 1 para ocupado, e 0 para livre.
    Partamos para os metodos agora:

    (3)proximoLivre, com o metodo criado, bastou que o chamemos aqui na classe principal, que o mesmo já 
    estará funcionando

    (4)verifica, com o metodo criado, perguntamos ao usuario um valor e passamos como parametro.

    (5)Ocupa, com o metodo criado, perguntamos ao usuario um valor e passamos como parametro.

    (6)vagas, com o metodo criado, bastou que o chamemos no metodo main

    (7)clone, com o metodo criado, bastou que igualemos nosso objeto auxiliar (c) com o metodo de clonagem

***Notas finais***
    As questões que huliane passa são como um bolo. Comer inteiro pode ser dificil, mas dividir em fatias vai facilitar
    a digestão.

    se mesmo após a explicação da questão houver alguma duvida em especifico, me contate. Ou pesquise acerca dos seguintes topicos
        -Metodos com retorno
        -Instancia
        -passagem de objeto como parametro
*/
import java.util.*;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Voo v = new Voo();//Objeto principal
        Voo c = new Voo();//Objeto que recebera um clone do objeto v

        int auxi[] = new int[10]; //vetor auxiliar, servira para guardar posições aleatorias geradas pelo random

        for (int i = 0; i < v.getPassageiros().length; i++) {
            auxi[i] = rd.nextInt(2);
        }
        v.setPassageiros(auxi);//(0)perceba que por causa de nosso setPassageiros usar de parameto um vetor, então devemos
        //passar o vetor inteiro como parametro, e não apenas uma só posição. Por isso preenchemos um auxiliar e depois
        //atribuimos para o objeto

        v.proximoLivre();//chamando o metodo proximo livre do objeto v

        System.out.println("Digite a posicao que deseja verificar:");
        int a = sc.nextInt();
        v.verifica(a-1);//utilizamos do -1 para adaptarmos o numero digitado pelo usuario ao nosso vetor, já que na linguagem 
        //computacional, começamos a contar apartir do 0

        System.out.println("Digite a posicao da cadeira que deseja ocupar");
        a = sc.nextInt();
        v.ocupa(a-1);//utilizamos do -1 para adaptarmos o numero digitado pelo usuario ao nosso vetor, já que na linguagem 
        //computacional, começamos a contar apartir do 0

        v.retornaVagas();//chamando o metodo que retorna as cadeiras livres

        c = c.clone(v);//igualamos c ao metodo de clonagem, assim, c se igualará ao retorno do metodo de clonagem (v)

    }
}