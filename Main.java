import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	int numero;
	
	numero = sc.nextInt();
	
	if (numero<0) {
		System.out.println("Esse número é negativo");
	}
	else if (numero > 0) {
		System.out.println("Esse numero é positivo");
	}
	else if (numero == 0) {
		System.out.println("Não negativo");
	}
	sc.close();
	
	}
}
