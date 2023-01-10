public class Sistema {
    private Banco banco;

    public Sistema(){
        banco = new Banco();
    }

    public void logar(String email, String senha){
        boolean logou = false;
        for (int i = 0; i < banco.getUsuarios().size(); i++) {
            if (banco.getUsuarios().get(i).getEmail().equals(email)) {
                if (banco.getUsuarios().get(i).getSenha().equals(senha)) {
                    System.out.println("Usuario Logado!!!");
                    logou = true;
                    break;
                }
            }
        }
        if (logou == false) {
            System.out.println("Email ou senha incorreto");
        }

    }
}
