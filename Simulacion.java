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
		Guerrero gue = new Guerrero();
		Explorador exp = new Explorador();
		Cazador ca = new Cazador(); //Nueva clase agregada.
		Mascota mas = new Mascota(); //Nueva clase agregada.
		Enemigo ene = new Enemigo();
		Jefe jefe = new Jefe(); 
		Jefazo je = new Jefazo(); //Nueva clase agregada.
		int turnos = 0; //Variables que se usarán para el control de turnos.
		int turnosJ = 0;
		int turnosJe = 0;
		int opcion = 0;
		int decision = 0;
		try{ //Bloque try para obtener excepciones e irregularidades en el programa.
		//Presentación al usuario.
			System.out.println("Bienvenido a este simulador de un videojuego, hoy tendras que superar dos batallas para proclamarte vencedor.\nPero primero, contesta estas preguntas:\n");
			gue.DarNombre(); //Método para asignar nombre al guerrero.
			exp.DarNombre(); //Método para asignar nombre al explorador.
			
			System.out.println("\nOk, ahora que has nombrado a tus personajes, es momento de librar tu primera batalla!");
			System.out.println("Pero antes, deseas el modo normal o deseas enfrentar a un jefe especial?\n1. Modo normal.\n2. It's boss time!"); //Decision para tomar el modo normal o enfrentarte al jefe más poderoso.
			decision = scan.nextInt();
			if (decision == 1){
				System.out.println("Bien, prepárese para el modo normal:\n");
				while (turnos != 10){ //Hasta que los turnos lleguen a 10, la batalla sigue su curso.
					System.out.println("Turno del guerrero");
					gue.AtaqueG(); //Método para el ataque del guerrero.
					System.out.println("Turno del explorador");
					exp.AtaqueE(); //Método para el ataque del explorador.
					System.out.println("Turno del enemigo");
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
							new Jefe();
							System.out.println("Turno del guerrero");
							gue.AtaqueG();
							System.out.println("Turno del explorador");
							exp.AtaqueE();
							System.out.println("Turno del jefe");
							jefe.AtaqueJ(); //Método de ataque del jefe.
							turnosJ = turnosJ + 1; //Contador de turnos.
						}
						if (turnosJ == 15){ //Cuando llegue a 15 turnos, se acaba la pelea, el jefe y los enemigos que quedaban se van.
							System.out.println("Escuchas de repente unos pasos acercarse cada vez mas. El jefe al que enfrentabas huye despavorido... Deseas quedarte?\1.Si\n2.No.");
							opcion = scan.nextInt();
							if (opcion == 1){
								System.out.println("Tu y tu amigo explorador se quedan en el lugar, luego de curarse, ven como un cazador huye con su mascota\nmientras un temible ser mucho mas poderoso va tras ellos. Preparense para combatir!");
								while (turnosJe != 30){ //30 turnos es el máximo para intentar derrotar al jefazo.
									new Guerrero();
									new Explorador();
									new Cazador();
									new Mascota();
									new Jefazo(); //Se reestablecen valores.
									System.out.println("Turno del guerrero");
									gue.AtaqueG();
									System.out.println("Turno del explorador");
									exp.AtaqueE();
									System.out.println("Turno del cazador");
									ca.AtaqueC();
									System.out.println("Turno del jefazo");
									je.AtaqueJe();
									turnosJe = turnosJe + 1;
								}
								if (turnosJe == 30){ //Termina la pelea y el juego.
									System.out.println("Menos mal, el jefazo se canso y ya los dejo en paz, que suerte tuvieron.");
								}
							}
							if (opcion == 2){ //Decidió correr, sabia decisión.
								System.out.println("Bueno, como bien dicen, patitas para que las quiero, escondase en un lugar seguro y gracias por jugar!");
							}
						}
					}
					if (opcion == 2){ //Si la respuesta es que no quiere luchar contra el jefe, se despide al usuario.
						System.out.println("Bien, muchas gracias por jugar!");
					}
				}
			}
			if (decision == 2){ //Pelea contra el nuevo jefe.
				System.out.println("Bueno, usted asi lo quiso, le ponemos al mas yuca de todos.");
				System.out.println("Preparense para combatir!");
				while (turnosJe != 30){ //30 turnos es el máximo de turnos disponibles para aniquilar al jefazo.
					new Guerrero();
					new Explorador();
					new Cazador();
					new Mascota();
					new Jefazo();
					System.out.println("Turno del guerrero");
					gue.AtaqueG();
					System.out.println("Turno del explorador");
					exp.AtaqueE();
					System.out.println("Turno del cazador");
					ca.AtaqueC();
					System.out.println("Turno del jefazo");
					je.AtaqueJe();
					turnosJe = turnosJe + 1;
				}
				if (turnosJe == 30){ //Termina la pelea al llegar a los 30 turnos.
					System.out.println("Menos mal, el jefazo se canso y ya los dejo en paz, que suerte tuvieron.");
				}
			}
		}
		catch(Exception e){ //Mensaje que muestra al hallar excepciones.
			System.out.println("Por favor, ingrese un numero de opcion que sea valido.");
		}
	}
}