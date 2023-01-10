import java.util.ArrayList;

public class Banco{

	private ArrayList<User> usuarios;

	public Banco(){
		usuarios = new ArrayList<User>();
		UserSeeder();
	}

	public void UserSeeder(){
		usuarios.add(new User("shaolinMatadorDePorco@gmail.com", "12345678"));
		usuarios.add(new User("pedroAugusto@gmail.com", "12345678"));
		usuarios.add(new User("glaucyrlei@gmail.com", "12345678"));
	}

	public ArrayList<User> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<User> usuarios) {
		this.usuarios = usuarios;
	}

	

}