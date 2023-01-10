import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sistema s = new Sistema();
		
		System.out.println("---------Sistema de login----------");
		System.out.println("Digite seu email:");
		String email = sc.nextLine();
		System.out.println("Digite sua senha");
		String senha = sc.nextLine();
		s.logar(email, senha);

	}
}