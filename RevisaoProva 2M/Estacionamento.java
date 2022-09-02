public class Estacionamento{
    private String placa;
    private String modelo;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    public Estacionamento(){
        horaEntrada = new Tempo();
        horaSaida = new Tempo();
    }

    public void exibir(){
        System.out.println("Placa: "+ placa);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Hora de entrada: "+ horaEntrada.getHoras()+":"+horaEntrada.getMinutos()+":"+ horaEntrada.getSegundos());
        System.out.println("Hora de saida: "+ horaSaida.getHoras()+":"+horaSaida.getMinutos()+":"+ horaSaida.getSegundos());
        System.out.println("Valor a ser pago: "+(horaSaida.subtrair(horaSaida, horaEntrada)*1.50));
    }

    
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tempo getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Tempo getHoraSaida() {
        return horaSaida;
    }
    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

}
