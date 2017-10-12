/*
 * @author POO
 * @File name Coronel.java
 * @Date and Project (12/10/2017) Laboratorio 4
 * 
 * PROPOSITO: Una clase para representar a los Coroneles.
 */ 



package Ejercicio4;


public class Coronel extends Teniente {
	
	/*
	 * @param
	 * PROPOSITO: Contiene el salario del coronel
	 */
	public double getSalario() {
		return super.getSalario() + 5000.0;      // Q45,000.00 / anio
	}
 
	
	/*
	 * @param
	 * PROPOSITO: Contiene la orden maniobra del coronel
	 */
	public void ejecutaOrdenManiobra() {
		System.out.println("Presenten Armas!");
	}
 
}