import java.util.Scanner;

public class Refactor01 {
	
	public static void main(String[] args) {
		
		// Creamos variables
		int lado, radio, base, altura;
		
		// Pedimos valor para cada una de las variables
		lado = pedirNumero("Introduce el valor del lado");
		radio = pedirNumero("Introduce el valor del radio");
		base = pedirNumero("Introduce el valor de la base");
		altura = pedirNumero("Introduce el valor de la altura");
		
		float area, pi = 3.14f; // VARIABLES
		area = lado * lado; // Calculo
		Imprime("CUADRADO", area); // Imprime en pantalla
		area = pi * radio * radio; // Calculo
		Imprime("CIRCULO", area); // Imprime en pantalla
		area = base * altura; // Calculo
		Imprime("RECTANGULO", area); // Imprime en pantalla
	}
	
	// Metodo para pedir un numero
	public static int pedirNumero(String mensaje) {
		Scanner entrada = new Scanner(System.in);		// Lector de datos
		
		System.out.println(mensaje);
		int numero = entrada.nextInt();
		
		return numero;
	}

	public static void Imprime(String tipo, float area) {
		System.out.println("---- AREA DE UN " + tipo + " ------ \n" + area + "\n" + "-------------------------------");
	}
}