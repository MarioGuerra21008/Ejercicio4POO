import java.util.Scanner;
import java.io.IOException;

/**
* Clase heredada de Combatiente enfocada al guerrero.
* @author Mario Guerra
* @version 28/9/2021
* @see Guerrero
*/

class Guerrero extends Combatiente{
	/**
	* Constructor para la clase de Guerrero.
	*/
	Scanner scan = new Scanner(System.in);
	String MensajeG;
	/**
	* Fin del constructor de la clase Guerrero.
	*/
	
	/**
	* Método DarNombre
	*/
	public void DarNombre(){ //Se le pregunta al usuairo que nombre quiere dar a su guerrero.
		System.out.println("Cual deseas que sea el nombre de tu guerrero?\n");
		this.nombre = scan.next();
		System.out.println("Muy bien, " + this.nombre + " es momento de pelear!");
	}
	
	/**
	* Método AtaqueG
	*/
	public void AtaqueG(){
		this.HP = 500; //Valores de vida, ataque y especial.
		this.AP = 95;
		this.Especial = 135;
		int contador = 0; //Contador de daño.
		System.out.println("Desea decir algo a sus contrincantes?\n"); //Mensaje que quiere decirle a sus oponentes.
		MensajeG = scan.next();
		System.out.println("Su turno ha llegado, elija que quiere hacer.\n1. Atacar.\n2. Especial.\n3. Item.\n4. Saltar Turno.");
		this.eleccion = scan.nextInt();
		
		if (this.eleccion == 1){ //Opcion de atacar.
			contador = contador + 95;
			System.out.println("El enemigo ha perdido 95 puntos de daño");
			}
		else if (this.eleccion == 2){ //Opcion de especial.
			contador = contador + 135;
			System.out.println("Increible! El enemigo ha sufrido 135 puntos de daño.");
			}
		else if (this.eleccion == 3){ //Opcion para dar items.
			System.out.println("1. Jarabe.\n2. Veneno.\n");
			this.item = scan.nextInt();
				if (this.item == 1){ //Da jarabe a si mismo.
					this.HP = this.HP + 50;
					System.out.println("Bien, usted ha recuperado 50 puntos de vida");
				}
				else if (this.item == 2){ //Tira veneno a los rivales.
					contador = contador + 30;
					System.out.println("Oh, le ha hecho daño con su veneno a todos los enemigos, son 30 puntos de salud menos!");
				}
			}
		else if (this.eleccion == 4){ //Pasa el turno.
			System.out.println("Bien, turno otorgado a su compañero.");
		}
		if (contador >= 1000){ //Si hizo 1000 puntos de daño, ganó la pelea.
			System.out.println("Bien, derroto al enemigo.");
		}
	}
}
