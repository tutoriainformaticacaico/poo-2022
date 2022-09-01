/* 1- Crie uma classe Tempo com três atributos: horas, minutos e segundos. Crie métodos para:
Funcionar como get e set.
Imprimir os atributos no formato hh:mm:ss.
Subtrair dois objetos e colocar o resultado no objeto que o chamou.
Somar dois objetos e colocar o resultado no objeto que o chamou.

2- Crie uma classe Estacionamento para armazenar dados de um estacionamento. Os atributos devem representar a 
placa e modelo do carro além da hora de entrada e saída do estacionamento. Utilize dois objetos da classe Tempo criada no exercício anterior. Crie métodos para:
Funcionar como get  e set .
Imprimir os dados de um carro estacionado.
Calcular e retornar o valor a ser pago pelo carro estacionado. Considere o preço de R$1,50 por hora. Utilize o método da classe Tempo. 

***Notas iniciais***
    A começar, não irei entrar mais em detalhes a pontos já comentados em questões anteriores, como instancia
    atributos privados, gets e sets e metodos e funções. Já que se espera que os mesmos ja tenham sido aprendidos
    ao olhar os outros arquivos, portanto, vamos começar;

***Explicação do codigo***

    Após geradas todas as informações pedidos pela questão (atributos, gets e sets), vamos seguir para a logica
    dos metodos, que sao os pontos mais dificeis ao atual momento.

    A começar, a questao nos pede para criar dois objetos da classe tempo na classe estacionamento, onde os mesmos
    sao criados inicialmente como variaveis[1] e dentro de um construtor sao incializados com o conteudo da classe.

    Perceba que nao instanciamos a classe tempo no nosso metodo main, isto ocorre porque como já temos dois objetos
    dentro de Estacionamento, nao precisamos criar outros objetos no main, visto que sempre que instanciado um 
    objeto Estacionamento, o mesmo já tera acompanhado dois objetos internos de Tempo[2]. 

    Agora, se precisarmos chamar os objetos, basta que chamemos o objeto 'mãe', que é estacionamento, depois
    chamemos o get de nosso objeto, e logo em seguida o que quisermos pegar do objeto de Tempo.

    Vale ressaltar que o metodo get retorna para a atual posição da chamada do mesmo o conteudo que foi chamado.
    Como assim?

    se fizermos por exemplo
    e.setPlaca("NBSW123");
    e.getPlaca();

    no local onde foi chamado o get, sera substituido diretamente pela variavel da placa, ou seja, eh 
    como se ficasse assim:

    e.setPlaca("NBSW123);
    placa

    perceba que o mesmo fica então largado em meio ao codigo, por isso, se quisermos imprimir utilizando dos
    metodos gets, o colocamos dentro de um println();

    Agora segundo para logica do get do objeto, o mesmo retornara a variavel de nosso objeto de tempo dentro
    de Estacionamento, ou seja:

    e.getHoraEntrada();

    ficaria assim em outros olhos:

    e.horaEntrada;

    Perceba que este eh o nome de nosso objeto de hora de entrada contido em estacionamento[1], assim, 
    se quisermos chamar o objeto para chamar algo a mais, então basta que chamemos o metodo get dele.
    Demonstrando um outro exemplo:

    e.getHoraSaida().setHoras(14);
    e.getHoraSaida().getHoras();

    Ficaria dessa forma em outros olhos:

    e.horaSaida.setHoras(14);
    e.horaSaida.horas;

    Perceba que não se diferencia de como usamos normalmente um objeto para chamar algo. Pegamos seu nome seguido de 
    um '.' e logo depois colocamos o nome do que queremos chamar, a unica diferença, eh que, como o objeto está
    dentro de um outro objeto, devemos chamar o objeto "mãe" para que possamos usar o objeto filho.

    Resumidamente, então a cada criação de 1 objeto estacionamento, teremos 2 objetos de tempo sendo criados.

    Tendo isso tudo em mente, vamos para logica de calcular o preco do estacionamento.

    Tendo em vista que fizemos a subtração de horas dentro de um metodo em Tempo, bastou que o chamemos no metodo de
    Estacionamento para que ele calcule pra gente as horas que ele passou lá[3]. 

    Perceba que nosso programa só apresenta 2 falhas:

    1° eh possivel informar horas, minutos e segundos fora do normal, isto eh, podemos dizer que foram 45 horas, 250 minutos
    e 900 segundos. E os mesmos não serao formatados. Isto eh, não serao convertidos para um horario valido.

    2° Estamos calculando apenas o valor do estacionamento nos baseando nas Horas, ou seja, se o mesmo passar ficar das
    13:00:00 as 14:59:59 no estacionamento, ainda só pagara 1.50, visto que apenas as horas são utilizadas para calcular
    o valor a ser pago.

    ***Notas Finais***
    Com o codigo nesse estado atual, voces já atingiriam 80% da nota ou até 100%. Visto que para melhor realização
    dessa questão, mais de 1 hora seriam gastas. Dentro de 5 dias, eu postarei a resolução sem bugs do mesmo.
    Até lá, fiquem avontade para tentarem e tentarem resolver ^^

*/

import java.util.*;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Estacionamento e = new Estacionamento ();

        System.out.println("Digite a placa do carro");
        e.setPlaca(sc.nextLine());
        System.out.println("Digite o modelo do carro");
        e.setModelo(sc.nextLine());
        System.out.println("Digite a hora de entrada do veiculo");
        e.getHoraEntrada().setHoras(sc.nextInt());
        System.out.println("Digite o minuto de entrada do veiculo");
        e.getHoraEntrada().setMinutos(sc.nextInt());
        System.out.println("Digite os segundos de entrada do veiculo");
        e.getHoraEntrada().setSegundos(sc.nextInt());
        System.out.println("Digite a hora de saida do veiculo");
        e.getHoraSaida().setHoras(sc.nextInt());
        System.out.println("Digite o minuto de saida do veiculo");
        e.getHoraSaida().setMinutos(sc.nextInt());
        System.out.println("Digite os segundos de saida do veiculo");
        e.getHoraSaida().setSegundos(sc.nextInt());

        e.exibir();
        e.calcularEstacionamento();


        


    }
}