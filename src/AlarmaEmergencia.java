/*
 * @author Odalis Reyes
 * @File name AlarmaEmergencia.java
 * @Date and Project (12/10/2017) Laboratorio 4
 * 
 * PROPOSITO: Tiene como objetivo principal satisfacer las necesidades requeridas por la AlarmaMain.
 */


/* Se llama la clase super, la cual es Timbre */
public class AlarmaEmergencia extends Timbre {
	
	/*
	 * Creacion del objeto, el cual servira para llamar los metodos de las otras clases
	 */
	Alarma nuevaAlarma = new Alarma();
	
	
	/*
	 * @param 
	 * PROPOSITO: Muestra en pantalla un nuevo mensaje: emergencia 1
	 */
	public void m1() {
		System.out.println("emergencia 1");
	}
	
	
	/*
	 * @param
	 * PROPOSITO: Muestra en pantalla los metodos de la clase Alarma
	 */
	public void m2() {
		/* se mandan a llamar los métodos de la clase Alarma mediante el objeto creado al prinicpio */
		nuevaAlarma.m1();
		nuevaAlarma.m2();
	}
	
	
	/*
	 * @param 
	 * PROPOSITO: Muestra en pantalla el mensaje de emergencia con la concatenacion del toString de Alarma 
	 */
	public String toString() {
		/* variable para crear el mensaje emergencia */
		String mensaje = "emergencia ";
		return mensaje + super.toString() + "..." + super.toString();
	}
	
	
	/* FIN */
	
}
