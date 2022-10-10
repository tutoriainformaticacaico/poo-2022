package Calculadora;
public class Calculadora {
    
    private double valor1;
    private double valor2;
    private double resultado;
    private char operacao;

    public Calculadora(){
        this.valor1 = 0.0;
        this.valor2 = 0.0;
        this.resultado = 0.0;
    }

    public double calcular(){
        if (operacao == '+') {
            return valor1 + valor2;
        }else if(operacao == '-'){
            return valor1 - valor2;
        }else if(operacao == '*'){
            return valor1 * valor2;
        }else if(operacao == '/'){
            return valor1 / valor2;
        }else{
            return resultado;
        }
    }

    public void resultado(){
        System.out.println("O resultado da equação foi: ");
        System.out.println("Resultado: "+(calcular()));
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public char getOperacao() {
        return operacao;
    }
    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
