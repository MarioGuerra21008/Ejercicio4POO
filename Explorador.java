import java.util.Scanner;
import java.io.IOException;

/**
* Clase heredada de Combatiente enfocada al explorador.
* @author Mario Guerra
* @version 28/9/2021
* @see Explorador
*/

class Explorador extends Combatiente{
	/**
	* Constructor para la clase de Explorador.
	*/
	Scanner scan = new Scanner(System.in);
	String MensajeE;
	/**
	* Fin del constructor de la clase Explorador.
	*/
	
	/**
	* Método DarNombre
	*/
	public void DarNombre(){ //Se le pregunta al usuario que nombre darle a su explorador.
		System.out.println("Cual deseas que sea el nombre de tu explorador?\n");
		this.nombre = scan.next();
		System.out.println("Muy bien, " + this.nombre + " es momento de pelear!");
	}
	
	/**
	* Método AtaqueE
	*/
	public void AtaqueE(){
		this.HP = 250; //Valores de vida, ataque y especial.
		this.AP = 20;
		this.Especial = 55;
		int contador = 0; //Contador de daño.
		System.out.println("Desea decir algo a sus contrincantes?\n");
		MensajeE = scan.next();
		System.out.println("Su turno ha llegado, elija que quiere hacer.\n1. Atacar.\n2. Especial.\n3. Item.\n4. Saltar Turno.");
		this.eleccion = scan.nextInt();
		
		if (this.eleccion == 1){ //Opcion de ataque.
			contador = contador + 20;
			System.out.println("El enemigo ha perdido 20 puntos de daño");
		}
		else if (this.eleccion == 2){ //Opcion de especial.
			contador = contador + 55;
			System.out.println("Increible! El enemigo ha sufrido 55 puntos de daño.");

		}
		else if (this.eleccion == 3){ //Opcion de items.
			System.out.println("1. Jarabe.\n2. Veneno.\n3. Tabletas.\n4. Agua pura");
			this.item = scan.nextInt();
			if (this.item == 1){ //Da jarabe a si mismo.
				this.HP = this.HP + 50;
				System.out.println("Bien, usted ha recuperado 50 puntos de vida");
			}
			else if (this.item == 2){ //Tira veneno a los rivales.
				contador = contador + 30;
				System.out.println("Oh, le ha hecho daño con su veneno a todos los enemigos, son 30 puntos de salud menos!");
			}
			else if (this.item == 3){ //Aumenta su poder de ataque.
				this.AP = this.AP + 40;
				System.out.println("Perfecto, su poder de ataque ha aumentado en 40 puntos, use sabiamente su proximo turno");
			}
			else if (this.item == 4){ //Da 30 puntos de vida a su guerrero.
				System.out.println("Bien, le da a su compañero 30 puntos mas de vida.");
			}
		}
		else if (this.eleccion == 4){ //Salta turno.
			System.out.println("Bien, turno otorgado al enemigo.");
		}
		if (contador >= 1000){ //Si hizo 1000 de daño, ha ganado la partida.
			System.out.println("Bien, derroto al enemigo.");
		}
	}
}
