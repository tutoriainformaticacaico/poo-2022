/* 
 * 1- (50 pontos) Implemente o que se pede:
Crie uma interface Lampada com métodos ligar() e desligar(), cujo contrato significa simplesmente imprimir mensagens informativas na tela;
Crie uma classe FabricaLampada que possui duas classes internas aninhadas que implementam a interface Lampada: Incandescente e Fluorescente;
Crie ainda um método construir(), que receba um parâmetro indicando o tipo de lâmpada e retorne o objeto Lampada criado;
Crie uma classe TesteLampada com o método main(). Pergunte ao usuário qual lâmpada ele quer construir, ligue e desligue a lâmpada.
 */
import java.util.*;

public class TesteLampada{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FabricaLampada f = new FabricaLampada();

        System.out.println("-------Gabarito prova 4° bimestre 2M---------");
        System.out.println("Qual lampada deseja criar?\n1-Fluorescente\n2-Incandescente");
        int auxi = sc.nextInt();

        Lampada lampada = f.construir(auxi);

        System.out.println("O que deseja fazer?\n1-Acender\n2-Apagar");
        auxi = sc.nextInt();
        if (auxi == 1) {
            lampada.ligar();
        }else{
            lampada.ligar();
        }

    }
}