/*
 * @author Odalis Ryes
 * @File name Soldado.java
 * @Date and project (12/10/2017) Laboratorio 4
 * 
 * PROPOSITO: Crear los metodos necesarios para satisfacer las necesidades solicitadas para el Soldado
 */



package Ejercicio4;

/* Se llama Militar que es la superclass */
public class Soldado extends Militar {
	
	
	/*
	 * @param 
	 * PROPOSITO: Modificar la cantidad de horas para los soldados mediante el uso de herencia
	 */
	public int getHoras() {
		return super.getHoras()*2;
	}
	
	
	/*
	 * @param 
	 * PROPOSITO:Modificar el salario para los soldados mediante el uso de herencia
	 */
	public double getSalario() {
		return super.getSalario()-10000;
	}
	
	
	/*
	 * @param
	 * PROPOSITO: Modificar las vacaciones de los soldados
	 */
	public int getDiasVacaciones() {
		return super.getDiasVacaciones()/2;
	}
	
	
	/*
	 * @param
	 * PROPOSITO: Mostrar en pantalla el mensaje
	 */
	public String recibeOrden() {
		return "Ordene mi General";
	}
	
	
	/* FIN */

}
