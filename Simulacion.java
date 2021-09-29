import java.util.Scanner;
import java.io.IOException;

/**
* Videojuego RPG en consola - simulador de un videojuego.
* @author Mario Guerra
* @version 28/9/2021
* @see Simulacion
*/

class Simulacion{
	public static void main (String[] args){
		/**
		* Constructor para la clase de Simulacion.
		*/
		Scanner scan = new Scanner(System.in); //Acá se declaran las nuevas clases y sus variables para la simulación del juego.
		Combatiente comb = new Combatiente();
		Guerrero gue = new Guerrero();
		Explorador exp = new Explorador();
		Enemigo ene = new Enemigo();
		Jefe jefe = new Jefe();
		int turnos = 0; //Variables que se usarán para el control de turnos.
		int turnosJ = 0;
		int opcion = 0;
		try{ //Bloque try para obtener excepciones e irregularidades en el programa.
		//Presentación al usuario.
			System.out.println("Bienvenido a este simulador de un videojuego, hoy tendras que superar dos batallas para proclamarte vencedor.\nPero primero, contesta estas preguntas:\n");
			gue.DarNombre(); //Método para asignar nombre al guerrero.
			exp.DarNombre(); //Método para asignar nombre al explorador.
			
			System.out.println("\nOk, ahora que has nombrado a tus personajes, es momento de librar tu primera batalla!");
			while (turnos != 10){ //Hasta que los turnos lleguen a 10, la batalla sigue su curso.
				gue.AtaqueG(); //Método para el ataque del guerrero.
				exp.AtaqueE(); //Método para el ataque del explorador.
				ene.AtaqueEn(); //Método para el ataque del enemigo.
				turnos = turnos + 1; //Contador de turnos.
			}
			if (turnos == 10){ //Cuando llegue a 10 el número de turnos, se le pregunta al usuario si quiere pasar contra el jefe.
				System.out.println("Bien, tras 10 turnos seguro que la batalla fue extenuante, desea continuar?\n1.Si.\n2.No.");
				opcion = scan.nextInt();
				if (opcion == 1){
					System.out.println("Bien, ahora sigue la batalla contra el jefe, prepárese.");
					while (turnosJ != 15){ //15 turnos es el máximo de turnos disponibles para intentar aniquilar al jefe.
						new Guerrero(); //Se reestablecen los valores del Guerrero y el Explorador.
						new Explorador();
						gue.AtaqueG();
						exp.AtaqueE();
						jefe.AtaqueJ(); //Método de ataque del jefe.
						turnosJ = turnosJ + 1; //Contador de turnos.
					}
					if (turnosJ == 15){ //Cuando llegue a 15 turnos, se acaba el simulador.
						System.out.println("Hasta aqui llego la pelea, esperamos le haya gustado el juego, muchas gracias por jugarlo!");
					}
				}
				if(opcion == 2){ //Si la respuesta es que no quiere luchar contra el jefe, se despide al usuario.
					System.out.println("Bien, muchas gracias por jugar!");
				}
			}
		}
		catch(Exception e){ //Mensaje que muestra al hallar excepciones.
			System.out.println("Por favor, ingrese un numero de opcion que sea valido");
		}
	}
}