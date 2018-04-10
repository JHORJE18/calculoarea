# CalculoArea
Programa sencillo Java Consola para empezar en Java que calcula el Area de distintas figuras

## Procedimiento
El usuario inicia el programa y este le pide los datos de las dimensiones clave para calcular su area
```java
// Pedimos valor para cada una de las variables
lado = PedirNumero("Introduce el valor del lado");
radio = PedirNumero("Introduce el valor del radio");
base = PedirNumero("Introduce el valor de la base");
altura = PedirNumero("Introduce el valor de la altura");
```
Este metodo `PedirNumero()` muestra el mensaje que recibe y coge el número introducido por el usuario
```java
// Metodo para pedir un numero
public static int PedirNumero(String mensaje) {
        Scanner entrada = new Scanner(System.in);		// Lector de datos

        System.out.println(mensaje);
        int numero = entrada.nextInt();

        return numero;
}

```
Una vez contamos con los datos se procede a realizar su calculo y se muestra por consola
```java

    float area, pi = 3.14f; // VARIABLES
    area = lado * lado; // Calculo
    Imprime("CUADRADO", area); // Imprime en pantalla
    area = pi * radio * radio; // Calculo
    Imprime("CIRCULO", area); // Imprime en pantalla
    area = base * altura; // Calculo
    Imprime("RECTANGULO", area); // Imprime en pantalla
    
```
Contamos con el metodo `Imprime()` para que automaticamente muestre el texto y valor del dato enviado con un diseño y formato ya establecidos.
```java

public static void Imprime(String tipo, float area) {
    System.out.println("---- AREA DE UN " + tipo 
                        + " ------ \n" + area + "\n" 
                        + "-------------------------------");
}

```
