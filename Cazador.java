import java.util.Scanner;
import java.io.IOException;

/**
* Clase heredada de Combatiente enfocada al cazador.
* @author Mario Guerra
* @version 18/10/2021
* @see Cazador
*/

class Cazador extends Combatiente{
	/**
	* Constructor para la clase de Cazador.
	*/
	Scanner scan = new Scanner(System.in);
	String MensajeC;
	Mascota mas = new Mascota();
	/**
	* Fin del constructor de la clase Cazador.
	*/
	
	/**
	* Método DarNombre
	*/
	public void DarNombre(){ //Se le pregunta al usuario que nombre darle a su cazador.
		System.out.println("Cual deseas que sea el nombre de tu cazador?\n");
		this.nombre = scan.next();
		System.out.println("Muy bien, " + this.nombre + " es momento de pelear!");
	}
	
	/**
	* Método AtaqueC
	*/
	public void AtaqueC(){
		this.HP = 175; //Valores de vida, ataque y especial.
		this.AP = 40;
		this.Especial = 0;
		int contador = 0; //Contador de daño.
		System.out.println("Desea decir algo a sus contrincantes?\n");
		MensajeC = scan.next();
		System.out.println("Su turno ha llegado, elija que quiere hacer.\n1. Atacar.\n2. Lanzar a Fluffy.\n3. Saltar Turno.");
		this.eleccion = scan.nextInt();
		
		if (this.eleccion == 1){ //Opcion de ataque.
			contador = contador + 40;
			System.out.println("El enemigo ha perdido 40 puntos de daño");
		}
		else if (this.eleccion == 2){ //Opcion de especial. Invoca a Fluffy, el nombre de la mascota del cazador.
			contador = contador + 70;
			System.out.println("Ha invocado a Fluffy, usara su ataque especial!");
			mas.Especial();
			System.out.println("Gracias a Fluffy, el enemigo tiene 70 puntos menos de vida!"); //Fluffy hace 70 puntos de daño cada que es llamado por el cazador.
		}
		else if (this.eleccion == 3){ //Salta turno.
			System.out.println("Bien, turno otorgado al enemigo.");
		}
		if (contador >= 1500){ //Si hizo 1500 de daño, ha ganado la partida.
			System.out.println("Bien, derroto al enemigo.");
		}
	}
}