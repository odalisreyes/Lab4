/*
 * @author POO
 * @File name Alarma.java
 * @Date and Project (12/10/2017) Laboratorio 4
 * 
 * PROPOSITO: Metodos de Alarma (usa herencia de la superclass Timbre)
 */



public class Alarma extends Timbre {
	
	/*
	 * @param 
	 * PROPOSITO: Solamente imprime "alarma 1"
	 */
	public void m1() {
		System.out.println("alarma 1");
	}
	
	
	/*
	 * @param 
	 * PROPOSITO: Usa herencia para imprimir el metodo m1 de la clase Timbre
	 */
	public void m2() {
		super.m1();
	}
	 
	
	/*
	 * @param 
	 * PROPOSITO: Usa herencia para concatenar el toString de Timbre dos veces
	 */
	public String toString() {
		return super.toString() + "..." + super.toString();
	}
}