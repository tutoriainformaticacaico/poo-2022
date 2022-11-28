public abstract class CartaoWeb {
    protected String destinatario;

    public abstract void showMessage();

    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

}
