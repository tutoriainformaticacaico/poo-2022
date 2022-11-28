/* 
 * Escreva uma classe abstrata chamada CartaoWeb. 
 * Essa classe representa todos os tipos de cartões web e conterá apenas um atributo: 
 * destinatario (tipo String). Nessa classe você deverá também declarar o 
 * método public abstract void showMessage(). Crie classes filhas da classe 
 * CartaoWeb: DiaDosNamorados, Natal, Aniversario. Cada uma dessas classes 
 * deve conter um método construtor que receba o nome do destinatário do cartão. 
 * Cada classe também deve implementar o método showMessage(), mostrando uma 
 * mensagem ao usuário com seu nome e que seja específica para a data de comemorativa do cartão. 
 * Escreva um programa e no método main crie um vetor de CartaoWeb. 
 * Insira instâncias dos 3 tipos de cartões neste vetor. Após, use um laço for para 
 * exibir as mensagens deste cartão chamando o método showMessage().Em que linha(s) 
 * acontece polimorfismo nesse código?
 */

import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CartaoWeb cartoes[] = new CartaoWeb[3];

        //Nesse bloco de espaço abaixo vemos uma mae receber as informações de uma serie de filhas diferentes
        cartoes[0] = new DiaDosNamorados("Felipe");
        cartoes[1] = new Natal("Carlos");
        cartoes[2] = new Aniversario("Filó");

        //Apesar do mesmo tipo (cartaoWeb), o resultado será referente a filha atribuida
        for (int i = 0; i < cartoes.length; i++) {
            cartoes[i].showMessage();
        }
        
    }
}