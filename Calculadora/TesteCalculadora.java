package Calculadora;
import java.util.Scanner;

public class TesteCalculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();

        System.out.println("----------Calculadora----------");
        System.out.println("Digite o primeiro valor");
        c.setValor1(sc.nextDouble());
        System.out.println("Digite o segundo valor");
        c.setValor2(sc.nextDouble());

        System.out.println("Digite a equação a ser realizada");
        c.setOperacao(sc.next().charAt(0));

        c.resultado();
    }
}