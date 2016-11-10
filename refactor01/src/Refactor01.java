public class Refactor01 {
	public static void main(String[] args) {		
		int lado=3, radio=3, base=3, altura=6;	//VARIABLES
		float area, pi=3.14f;
		area=lado*lado;
	
		Imprime("CUADRADO", area);		//Imprimir por pantalla
		area=pi*radio*radio;
		Imprime("CIRCULO", area);
		area=base*altura;
		Imprime("RECTANGULO", area);
	}
	public static void Imprime(String tipo, float area){
		System.out.println("---- AREA DE UN " + tipo + " ------");
		System.out.println(area);
		System.out.println("-------------------------------");
	}
}