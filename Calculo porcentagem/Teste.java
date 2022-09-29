import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        //Como saber quanto um numero representa, em relação a outro
        a = 136.0;
        b = 21;

        //dividimos nosso numero pelo todo e depois multiplicamos por 100
        c = (b/a)* 100;

        //C, resultará na porcentagem referente a aquele numero
        System.out.println(c);



    }
}