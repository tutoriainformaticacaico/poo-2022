/* 
 * Subtrair dois objetos e colocar o resultado no objeto que o chamou.
    Somar dois objetos e colocar o resultado no objeto que o chamou.    
 */

public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public int subtrair(Tempo a, Tempo b){
        return a.getHoras() - b.getHoras();
    }
    public int somar(Tempo a, Tempo b){
        return a.getHoras() + b.getHoras();
    }

    public void exibir(){
        System.out.println("Horas: "+horas+":"+minutos+":"+segundos);
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
