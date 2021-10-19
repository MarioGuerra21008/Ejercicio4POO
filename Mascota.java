import java.util.Scanner;
import java.io.IOException;

/**
* Clase heredada de Acompanante enfocada a la mascota.
* @author Mario Guerra
* @version 18/10/2021
* @see Mascota
*/

class Mascota extends Acompanante{
	/**
	* Método Especial
	*/
	public void Especial(){ //Método para realizar el ataque de la mascota.
		this.HP = 100;
		this.Especial = 70;
		System.out.println("Preparate para sufrir la ira de Fluffy!"); //Mensaje de Fluffy hacia el usuario.
	}
}