public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public void exibir(){
        System.out.println("Horas: "+horas+":"+minutos+":"+segundos);
    }

    public int subtrair(Tempo a, Tempo b){
        return a.getHoras() - b.getHoras();
    }

    public int somar(Tempo a, Tempo b){
        return a.getHoras() + b.getHoras();
    }


    /**
     * @return int return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return int return the minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * @return int return the segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
        
    }

}
