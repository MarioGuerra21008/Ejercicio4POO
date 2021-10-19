import java.util.Scanner;
import java.io.IOException;

/**
* Clase heredada de Combatiente enfocada al jefazo o raid boss.
* @author Mario Guerra
* @version 18/10/2021
* @see Jefazo
*/

class Jefazo extends Combatiente{
	/**
	* Constructor para la clase de Jefazo.
	*/
	Scanner scan = new Scanner(System.in);
	String MensajeJe;
	int poder = 0;
	int clon = 0;
	/**
	* Fin del constructor de la clase Jefazo.
	*/
	
	/**
	* Método AtaqueJe
	*/
	public void AtaqueJe(){
	this.HP = 1500; //Valores de vida, ataque y especial del enemigo.
	this.AP = 120;
	this.Especial = 0;
	int contador = 0; //Contador de daño.
	System.out.println("Desea decir algo a sus contrincantes?\n");
	MensajeJe = scan.next();
	System.out.println("Su turno ha llegado, elija que quiere hacer.\n1. Atacar.\n2. Especial.\n3. Saltar Turno.");
	this.eleccion = scan.nextInt();
	
	if (this.eleccion == 1){ //Opcion de ataque.
		contador = contador + 120;
		System.out.println("El heroe ha perdido 90 puntos de daño");
	}
	else if (this.eleccion == 2){ //Opcion de especial.
		System.out.println("Que desea hacer, senor?\n1. Clonar. \n2. Variar. \3. Liberar."); //Su especial consiste en dar una opción de clonar, variar poder o liberar un clon para atacar a los enemigos.
		poder = scan.nextInt();
		if (poder == 1){
			System.out.println("A quien desea copiar?\n1. Guerrero. \n2. Explorador. \n3. Cazador. \n4. Mascota."); //Se decide a qué enemigo del jefazo va a clonar.
			clon = scan.nextInt();
			if (clon == 1){
				contador = contador + 95;
				System.out.println("Su clon ha hecho 95 puntos de daño al original!"); //Puntos de ataque quitados al guerrero.
			}
			if (clon == 2){
				contador = contador + 35;
				System.out.println("Su clon ha hecho 35 puntos de daño al original!"); //Puntos de ataque quitados al explorador.
			}
			if (clon == 3){
				contador = contador + 40;
				System.out.println("Su clon ha hecho 40 puntos de daño al original!"); //Puntos de ataque quitados al cazador.
			}
			if (clon == 4){
				contador = contador + 70;
				System.out.println("Su clon ha hecho 70 puntos de daño al original!"); //Puntos de ataque quitados a la mascota.
			}
		}
		else if (poder == 2){
			System.out.println("A que enemigo desea cambiar su clon?"); //Le ofrece al jefazo la posibilidad de cambiar el ataque de su clon.
			clon = scan.nextInt();
			if (clon == 1){
				System.out.println("Poder cambiado al de guerrero!"); //Cambia al poder del guerrero.
			}
			if (clon == 2){
				System.out.println("Poder cambiado al de explorador!"); //Cambia al poder del explorador.
			}
			if (clon == 3){
				System.out.println("Poder cambiado al de cazador!"); //Cambia al poder del cazador.
			}
			if (clon == 4){
				System.out.println("Poder cambiado al de mascota!"); //Cambia al poder de la mascota.
			}
		}
		else if (poder == 3){
			System.out.println("Clon liberado"); //Libera al clon, quedándose solito el jefazo.
		}
	}
	else if (this.eleccion == 3){ //Salto de turno.
		System.out.println("Bien, turno otorgado al enemigo.");
		}
	if (contador >= 925){ //Si hizo 925 de daño, ha ganado.
		System.out.println("Bien, derroto a los héroes, felicidades.");
		}
	}
}