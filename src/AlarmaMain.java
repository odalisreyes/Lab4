/*
 * @author POO
 * @File name Alarma.java
 * @Date and Project (12/10/2017) Laboratorio 4
 * 
 * PROPOSITO: Este programa cliente prueba el comportamiento de su clase AlarmaEmergencia.
 */ 

public class AlarmaMain {
	public static void main(String[] args) {
		
		/*
		 * creacion del objeto alarmaIncendio de tipo AlarmaEmergencia
		 */
		AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
		
		/* Imprime el metodo 1 de la clase AlarmaEmergencia */
		alarmaIncendio.m1();                  // emergencia 1
		
		/* Imprime el metodo 2 de la clase AlarmaEmergencia */
		alarmaIncendio.m2();                  // alarma 1 / timbre 1
		
		/* Imprime el toString de la clase AlarmaEmergencia */
		System.out.println(alarmaIncendio);   // emergencia Ringâ€¦Ringâ€¦Ringâ€¦Ring
	}
}