import java.util.Scanner;
import java.io.IOException;

/**
* Clase heredada de Combatiente enfocada al jefe.
* @author Mario Guerra
* @version 28/9/2021
* @see Jefe
*/

class Jefe extends Combatiente{
	/**
	* Constructor para la clase de Jefe.
	*/
	Scanner scan = new Scanner(System.in);
	String MensajeJ;
	/**
	* Fin del constructor de la clase Jefe.
	*/
	
	/**
	* Método AtaqueJ
	*/
	public void AtaqueJ(){
	this.HP = 1000; //Valores de vida, ataque y especial del enemigo.
	this.AP = 90;
	this.Especial = 140;
	int contador = 0; //Contador de daño.
	System.out.println("Desea decir algo a sus contrincantes?\n");
	MensajeJ = scan.next();
	System.out.println("Su turno ha llegado, elija que quiere hacer.\n1. Atacar.\n2. Especial.\n3. Item.\n4. Saltar Turno.");
	this.eleccion = scan.nextInt();
	
	if (this.eleccion == 1){ //Opcion de ataque.
		contador = contador + 90;
		System.out.println("El heroe ha perdido 90 puntos de daño");
	}
	else if (this.eleccion == 2){ //Opcion de especial.
		contador = contador + 140;
		System.out.println("Increible! El heroe ha sufrido 140 puntos de daño.");
	}
	else if (this.eleccion == 3){ //Opcion de items.
		System.out.println("1. Jarabe.\n2. Veneno.");
		this.item = scan.nextInt();
		if (this.item == 1){
			this.HP = this.HP + 50;
			System.out.println("Bien, usted ha recuperado 50 puntos de vida");
		}
		else if (this.item == 2){
			contador = contador + 30;
			System.out.println("Oh, le ha hecho daño con su veneno a todos los heroes, son 30 puntos de salud menos!");
		}
	}
	else if (this.eleccion == 4){ //Salto de turno.
		System.out.println("Bien, turno otorgado al enemigo.");
		}
	if (contador >= 750){ //Si hizo 750 de daño, ha ganado.
		System.out.println("Bien, derroto a los héroes, felicidades.");
		}
	}
}