/* 
 * 1- Crie uma classe Tempo com três atributos: horas, minutos e segundos. 
 * Crie métodos para: Funcionar como get e set.
Imprimir os atributos no formato hh:mm:ss.
Subtrair dois objetos e colocar o resultado no objeto que o chamou.
Somar dois objetos e colocar o resultado no objeto que o chamou.

2- Crie uma classe Estacionamento para armazenar dados de um estacionamento. 
Os atributos devem representar a placa e modelo do carro além da hora de entrada e 
saída do estacionamento. Utilize dois objetos da classe Tempo criada no exercício anterior. 
Crie métodos para:
Funcionar como get  e set .
Imprimir os dados de um carro estacionado.
Calcular e retornar o valor a ser pago pelo carro estacionado. Considere o preço de R$1,50 por hora. Utilize o método da classe Tempo.
 */

import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tempo t = new Tempo();
        // Tempo g = new Tempo();
        // Tempo h = new Tempo();
        Estacionamento e = new Estacionamento();

        // t.setHoras(16);
        // t.setMinutos(58);
        // t.setSegundos(45);
        
        // t.exibir();

        // System.out.println("Digite as horas ai meu nobre");
        // g.setHoras(sc.nextInt());
        // System.out.println("Digite outra hora ai meu novo");
        // h.setHoras(sc.nextInt());
        e.setPlaca("CSD$%s");
        e.setModelo("Corsa");

        e.getHoraEntrada().setHoras(14);
        e.getHoraSaida().setHoras(17);

        e.exibir();


        // int a = t.subtrair(g, h);

        // System.out.println(h.subtrair(g, h));
        // System.out.println(t.somar(g, h));


        


    }


}