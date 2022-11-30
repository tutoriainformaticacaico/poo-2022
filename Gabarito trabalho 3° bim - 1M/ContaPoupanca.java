public class ContaPoupanca extends ContaComum{
    private double rendimento;

    public ContaPoupanca(){
        rendimento = 0.05;
    }
    public void calcularRendimento(int meses){
        System.out.println("O rendimento em "+meses+" meses, sera de: "+(getSaldo()*meses*rendimento));
    }
}
