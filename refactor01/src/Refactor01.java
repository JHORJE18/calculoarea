public class Refactor01 {
	public static void main(String[] args) {		
		int lado=3, radio=3, base=3, altura=6;	//VARIABLES
		float area, pi=3.14f;					//VARIABLES
		area=lado*lado;				//Calculo
		Imprime("CUADRADO", area);		//Imprime en pantalla
		area=pi*radio*radio;		//Calculo
		Imprime("CIRCULO", area);		//Imprime en pantalla
		area=base*altura;			//Calculo
		Imprime("RECTANGULO", area);	//Imprime en pantalla
		}
	public static void Imprime(String tipo, float area){
		System.out.println("---- AREA DE UN " + tipo + " ------ \n" + area + "\n" + "-------------------------------");}}