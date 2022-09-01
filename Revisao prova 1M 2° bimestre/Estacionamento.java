public class Estacionamento {
    private String placa;
    private String modelo;
    private Tempo horaEntrada;//[1]
    private Tempo horaSaida;//[1]

    public Estacionamento(){
        horaEntrada = new Tempo();//[2]
        horaSaida = new Tempo();//[2]
    }

    public void exibir(){
        System.out.println("Estacionamento");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Hora entrada: " + horaEntrada.getHoras()+":"+horaEntrada.getMinutos()+":"+horaEntrada.getSegundos());
        System.out.println("Hora saida: " + horaSaida.getHoras()+":"+horaSaida.getMinutos()+":"+horaSaida.getSegundos());
    }

    public void calcularEstacionamento(){
        int tempoMantido = horaEntrada.subtrair(horaSaida, horaEntrada);//[3]
        System.out.println("Voce deverá pagar: "+(tempoMantido*1.50)+" Reais pelo estacionamento");
    }


    /**
     * @return String return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return Tempo return the horaEntrada
     */
    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return Tempo return the horaSaida
     */
    public Tempo getHoraSaida() {
        return horaSaida;
    }

    /**
     * @param horaSaida the horaSaida to set
     */
    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

}
