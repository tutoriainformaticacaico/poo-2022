public class FabricaLampada{
    private Lampada lampada;

    public Lampada construir(int tipo){
        if (tipo == 1) {
            return lampada = new Fluorescente();
        }else{
            return lampada = new Incandescente();
        }
    }
}
